// Last updated: 11/08/2026, 19:30:37
1class Solution {
2    public boolean detectCapitalUse(String word) {
3        int count = 0;
4
5        for (char c : word.toCharArray()) {
6            if (Character.isUpperCase(c)) {
7                count++;
8            }
9        }
10
11        return count == 0 ||
12               count == word.length() ||
13               (count == 1 && Character.isUpperCase(word.charAt(0)));
14    }
15}