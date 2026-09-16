// Last updated: 16/09/2026, 09:55:54
1import java.util.*;
2
3class Solution {
4    public List<String> wordBreak(String s, List<String> wordDict) {
5        Set<String> set = new HashSet<>(wordDict);
6        Map<Integer, List<String>> memo = new HashMap<>();
7
8        return solve(s, 0, set, memo);
9    }
10
11    private List<String> solve(String s, int start,
12                               Set<String> set,
13                               Map<Integer, List<String>> memo) {
14
15        if (start == s.length()) {
16            return Arrays.asList("");
17        }
18
19        if (memo.containsKey(start)) {
20            return memo.get(start);
21        }
22
23        List<String> result = new ArrayList<>();
24
25        for (int end = start + 1; end <= s.length(); end++) {
26            String word = s.substring(start, end);
27
28            if (set.contains(word)) {
29                List<String> rest = solve(s, end, set, memo);
30
31                for (String next : rest) {
32                    if (next.isEmpty()) {
33                        result.add(word);
34                    } else {
35                        result.add(word + " " + next);
36                    }
37                }
38            }
39        }
40
41        memo.put(start, result);
42        return result;
43    }
44}