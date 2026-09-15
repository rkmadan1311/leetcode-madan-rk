// Last updated: 15/09/2026, 10:16:20
1class Solution {
2    public String addBinary(String a, String b) {
3        StringBuilder result = new StringBuilder();
4
5        int i = a.length() - 1;
6        int j = b.length() - 1;
7        int carry = 0;
8
9        while (i >= 0 || j >= 0 || carry > 0) {
10            int sum = carry;
11
12            if (i >= 0)
13                sum += a.charAt(i--) - '0';
14
15            if (j >= 0)
16                sum += b.charAt(j--) - '0';
17
18            result.append(sum % 2);
19            carry = sum / 2;
20        }
21
22        return result.reverse().toString();
23    }
24}