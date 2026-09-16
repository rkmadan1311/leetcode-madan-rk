// Last updated: 16/09/2026, 08:50:01
1class Solution {
2    public String shortestPalindrome(String s) {
3        String rev = new StringBuilder(s).reverse().toString();
4
5        for (int i = 0; i < s.length(); i++) {
6            if (s.substring(0, s.length() - i)
7                    .equals(rev.substring(i))) {
8                return rev.substring(0, i) + s;
9            }
10        }
11
12        return "";
13    }
14}