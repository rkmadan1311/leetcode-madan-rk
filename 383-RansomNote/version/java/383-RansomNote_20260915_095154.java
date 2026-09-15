// Last updated: 15/09/2026, 09:51:54
1class Solution {
2    public boolean canConstruct(String ransomNote, String magazine) {
3        int[] count = new int[26];
4
5        for (char c : magazine.toCharArray()) {
6            count[c - 'a']++;
7        }
8
9        for (char c : ransomNote.toCharArray()) {
10            count[c - 'a']--;
11
12            if (count[c - 'a'] < 0) {
13                return false;
14            }
15        }
16
17        return true;
18    }
19}