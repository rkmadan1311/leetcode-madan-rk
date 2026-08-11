// Last updated: 11/08/2026, 14:16:25
class Solution {
    public boolean validPalindrome(String s) {
        char ch[] = s.toCharArray();
        int st = 0, e = s.length() - 1;

        while (st <= e) {
            if (ch[st] != ch[e]) {
                int l1 = st + 1, r1 = e;
                while (l1 < r1 && ch[l1] == ch[r1]) {
                    l1++;
                    r1--;
                }
                if (l1 >= r1) return true;
                int l2 = st, r2 = e - 1;
                while (l2 < r2 && ch[l2] == ch[r2]) {
                    l2++;
                    r2--;
                }
                if (l2 >= r2) return true;

                return false;
            }
            st++;
            e--;
        }
        return true;
    }
}