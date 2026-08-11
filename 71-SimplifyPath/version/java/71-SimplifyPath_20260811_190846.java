// Last updated: 11/08/2026, 19:08:46
1import java.util.*;
2
3class Solution {
4    public String simplifyPath(String path) {
5        String[] parts = path.split("/");
6        Stack<String> stack = new Stack<>();
7
8        for (String part : parts) {
9            if (part.equals("") || part.equals(".")) {
10                continue;
11            }
12
13            if (part.equals("..")) {
14                if (!stack.isEmpty()) {
15                    stack.pop();
16                }
17            } else {
18                stack.push(part);
19            }
20        }
21
22        StringBuilder result = new StringBuilder();
23
24        for (String dir : stack) {
25            result.append("/").append(dir);
26        }
27
28        return result.length() == 0 ? "/" : result.toString();
29    }
30}