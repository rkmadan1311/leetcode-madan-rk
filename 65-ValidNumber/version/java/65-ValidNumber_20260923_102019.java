// Last updated: 23/09/2026, 10:20:19
1class Solution {
2    public boolean isNumber(String s) {
3        boolean digit = false;
4        boolean dot = false;
5        boolean exp = false;
6        boolean expDigit = true;
7
8        for (int i = 0; i < s.length(); i++) {
9            char c = s.charAt(i);
10
11            if (Character.isDigit(c)) {
12                digit = true;
13                if (exp)
14                    expDigit = true;
15            }
16            else if (c == '+' || c == '-') {
17                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')
18                    return false;
19            }
20            else if (c == '.') {
21                if (dot || exp)
22                    return false;
23                dot = true;
24            }
25            else if (c == 'e' || c == 'E') {
26                if (exp || !digit)
27                    return false;
28                exp = true;
29                expDigit = false;
30            }
31            else {
32                return false;
33            }
34        }
35
36        return digit && expDigit;
37    }
38}