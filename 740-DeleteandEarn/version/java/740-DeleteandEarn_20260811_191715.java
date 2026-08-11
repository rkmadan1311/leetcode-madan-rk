// Last updated: 11/08/2026, 19:17:15
1class Solution {
2    public int deleteAndEarn(int[] nums) {
3        int max = 0;
4
5        for (int num : nums) {
6            max = Math.max(max, num);
7        }
8
9        int[] points = new int[max + 1];
10
11        for (int num : nums) {
12            points[num] += num;
13        }
14
15        int prev2 = 0;
16        int prev1 = 0;
17
18        for (int i = 0; i <= max; i++) {
19            int current = Math.max(prev1, prev2 + points[i]);
20
21            prev2 = prev1;
22            prev1 = current;
23        }
24
25        return prev1;
26    }
27}