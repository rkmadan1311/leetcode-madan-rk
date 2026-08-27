// Last updated: 27/08/2026, 09:25:05
1import java.util.*;
2
3class Solution {
4    public int[] intersection(int[] nums1, int[] nums2) {
5        HashSet<Integer> set = new HashSet<>();
6        
7        for (int n : nums1)
8            set.add(n);
9
10        ArrayList<Integer> list = new ArrayList<>();
11
12        for (int n : nums2) {
13            if (set.contains(n)) {
14                list.add(n);
15                set.remove(n);
16            }
17        }
18
19        int[] ans = new int[list.size()];
20
21        for (int i = 0; i < list.size(); i++)
22            ans[i] = list.get(i);
23
24        return ans;
25    }
26}