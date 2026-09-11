// Last updated: 11/09/2026, 09:20:05
1class Solution {
2    public int minimumMoves(String s) {
3        int count = 0;
4
5        for (int i = 0; i < s.length(); i++) {
6            if (s.charAt(i) == 'X') {
7                count++;
8                i += 2;
9            }
10        }
11
12        return count;
13    }
14}