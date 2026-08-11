// Last updated: 11/08/2026, 19:09:56
1import java.util.*;
2
3class Solution {
4    public String decodeString(String s) {
5        Stack<Integer> countStack = new Stack<>();
6        Stack<String> stringStack = new Stack<>();
7
8        String current = "";
9        int number = 0;
10
11        for (char c : s.toCharArray()) {
12
13            if (Character.isDigit(c)) {
14                number = number * 10 + (c - '0');
15
16            } else if (c == '[') {
17                countStack.push(number);
18                stringStack.push(current);
19
20                number = 0;
21                current = "";
22
23            } else if (c == ']') {
24                int count = countStack.pop();
25                String previous = stringStack.pop();
26
27                StringBuilder temp = new StringBuilder(previous);
28
29                for (int i = 0; i < count; i++) {
30                    temp.append(current);
31                }
32
33                current = temp.toString();
34
35            } else {
36                current += c;
37            }
38        }
39
40        return current;
41    }
42}