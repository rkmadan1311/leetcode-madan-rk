// Last updated: 28/08/2026, 09:00:57
1import java.util.*;
2
3class Solution {
4    public int[] topKFrequent(int[] nums, int k) {
5        HashMap<Integer, Integer> map = new HashMap<>();
6
7        for (int n : nums)
8            map.put(n, map.getOrDefault(n, 0) + 1);
9
10        PriorityQueue<Integer> pq = new PriorityQueue<>(
11            (a, b) -> map.get(a) - map.get(b)
12        );
13
14        for (int n : map.keySet()) {
15            pq.add(n);
16
17            if (pq.size() > k)
18                pq.poll();
19        }
20
21        int[] result = new int[k];
22
23        for (int i = k - 1; i >= 0; i--)
24            result[i] = pq.poll();
25
26        return result;
27    }
28}