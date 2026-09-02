// Last updated: 02/09/2026, 20:42:51
1class Solution {
2    public boolean isInterleave(String s1, String s2, String s3) {
3        int n = s1.length();
4        int m = s2.length();
5
6        if (n + m != s3.length())
7            return false;
8
9        boolean[][] dp = new boolean[n + 1][m + 1];
10        dp[0][0] = true;
11
12        for (int i = 0; i <= n; i++) {
13            for (int j = 0; j <= m; j++) {
14                if (i > 0 && s1.charAt(i - 1) == s3.charAt(i + j - 1))
15                    dp[i][j] |= dp[i - 1][j];
16
17                if (j > 0 && s2.charAt(j - 1) == s3.charAt(i + j - 1))
18                    dp[i][j] |= dp[i][j - 1];
19            }
20        }
21
22        return dp[n][m];
23    }
24}