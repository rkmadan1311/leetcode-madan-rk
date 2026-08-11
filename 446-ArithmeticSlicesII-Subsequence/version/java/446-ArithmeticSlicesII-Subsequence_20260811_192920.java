// Last updated: 11/08/2026, 19:29:20
1import java.util.*;
2
3class Solution {
4    public int numberOfArithmeticSlices(int[] nums) {
5        int n = nums.length;
6        long answer = 0;
7
8        @SuppressWarnings("unchecked")
9        HashMap<Long, Integer>[] dp = new HashMap[n];
10
11        for (int i = 0; i < n; i++) {
12            dp[i] = new HashMap<>();
13
14            for (int j = 0; j < i; j++) {
15                long diff = (long) nums[i] - nums[j];
16
17                int count = dp[j].getOrDefault(diff, 0);
18                int current = dp[i].getOrDefault(diff, 0);
19
20                dp[i].put(diff, current + count + 1);
21
22                answer += count;
23            }
24        }
25
26        return (int) answer;
27    }
28}