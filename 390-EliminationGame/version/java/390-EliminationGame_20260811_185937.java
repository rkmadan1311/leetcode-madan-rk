// Last updated: 11/08/2026, 18:59:37
1class Solution {
2    public int lastRemaining(int n) {
3        int head = 1;
4        int step = 1;
5        int remaining = n;
6        boolean left = true;
7
8        while (remaining > 1) {
9            // Moving from left or moving from right
10            if (left || remaining % 2 == 1) {
11                head += step;
12            }
13
14            remaining /= 2;
15            step *= 2;
16            left = !left;
17        }
18
19        return head;
20    }
21}