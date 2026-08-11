// Last updated: 11/08/2026, 19:31:07
1class Solution {
2    public String reverseWords(String s) {
3        char[] chars = s.toCharArray();
4
5        int start = 0;
6
7        for (int i = 0; i <= chars.length; i++) {
8            if (i == chars.length || chars[i] == ' ') {
9                reverse(chars, start, i - 1);
10                start = i + 1;
11            }
12        }
13
14        return new String(chars);
15    }
16
17    private void reverse(char[] chars, int left, int right) {
18        while (left < right) {
19            char temp = chars[left];
20            chars[left] = chars[right];
21            chars[right] = temp;
22
23            left++;
24            right--;
25        }
26    }
27}