// Last updated: 01/09/2026, 20:30:38
1class Solution {
2    public int splitArray(int[] nums, int k) {
3        int low = 0, high = 0;
4
5        for (int n : nums) {
6            low = Math.max(low, n);
7            high += n;
8        }
9
10        while (low < high) {
11            int mid = low + (high - low) / 2;
12
13            int parts = 1;
14            int sum = 0;
15
16            for (int n : nums) {
17                if (sum + n > mid) {
18                    parts++;
19                    sum = n;
20                } else {
21                    sum += n;
22                }
23            }
24
25            if (parts <= k)
26                high = mid;
27            else
28                low = mid + 1;
29        }
30
31        return low;
32    }
33}