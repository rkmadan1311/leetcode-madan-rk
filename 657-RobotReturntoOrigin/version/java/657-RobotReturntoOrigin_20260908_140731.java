// Last updated: 08/09/2026, 14:07:31
1class Solution {
2    public boolean judgeCircle(String moves) {
3        int x = 0, y = 0;
4
5        for (char c : moves.toCharArray()) {
6            if (c == 'U') y++;
7            else if (c == 'D') y--;
8            else if (c == 'L') x--;
9            else if (c == 'R') x++;
10        }
11
12        return x == 0 && y == 0;
13    }
14}