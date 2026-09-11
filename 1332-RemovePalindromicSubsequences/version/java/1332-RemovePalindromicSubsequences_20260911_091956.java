// Last updated: 11/09/2026, 09:19:56
1class Solution {
2    public int removePalindromeSub(String s) {
3        if (s.length() == 0)
4            return 0;
5
6        int left = 0;
7        int right = s.length() - 1;
8
9        while (left < right) {
10            if (s.charAt(left) != s.charAt(right))
11                return 2;
12            left++;
13            right--;
14        }
15
16        return 1;
17    }
18}