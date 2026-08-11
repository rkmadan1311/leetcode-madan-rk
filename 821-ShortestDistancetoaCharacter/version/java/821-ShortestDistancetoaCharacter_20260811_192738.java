// Last updated: 11/08/2026, 19:27:38
1class Solution {
2    public int[] shortestToChar(String s, char c) {
3        int n = s.length();
4        int[] result = new int[n];
5
6        int prev = -n;
7
8        // Left to right
9        for (int i = 0; i < n; i++) {
10            if (s.charAt(i) == c) {
11                prev = i;
12            }
13
14            result[i] = i - prev;
15        }
16
17        // Right to left
18        prev = 2 * n;
19
20        for (int i = n - 1; i >= 0; i--) {
21            if (s.charAt(i) == c) {
22                prev = i;
23            }
24
25            result[i] = Math.min(result[i], prev - i);
26        }
27
28        return result;
29    }
30}