// Last updated: 11/08/2026, 19:18:15
1import java.util.*;
2
3class KthLargest {
4
5    private PriorityQueue<Integer> minHeap;
6    private int k;
7
8    public KthLargest(int k, int[] nums) {
9        this.k = k;
10        minHeap = new PriorityQueue<>();
11
12        for (int num : nums) {
13            add(num);
14        }
15    }
16
17    public int add(int val) {
18        minHeap.offer(val);
19
20        if (minHeap.size() > k) {
21            minHeap.poll();
22        }
23
24        return minHeap.peek();
25    }
26}