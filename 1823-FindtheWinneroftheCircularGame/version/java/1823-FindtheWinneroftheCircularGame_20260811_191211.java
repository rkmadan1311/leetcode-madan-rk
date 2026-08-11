// Last updated: 11/08/2026, 19:12:11
1class Solution {
2    public int findTheWinner(int n, int k) {
3        int winner = 0;
4
5        // Josephus problem
6        for (int i = 2; i <= n; i++) {
7            winner = (winner + k) % i;
8        }
9
10        return winner + 1;
11    }
12}