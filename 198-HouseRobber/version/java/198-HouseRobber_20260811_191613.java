// Last updated: 11/08/2026, 19:16:13
1class Solution {
2    public int rob(int[] nums) {
3        int prev2 = 0;
4        int prev1 = 0;
5
6        for (int money : nums) {
7            int current = Math.max(prev1, prev2 + money);
8
9            prev2 = prev1;
10            prev1 = current;
11        }
12
13        return prev1;
14    }
15}