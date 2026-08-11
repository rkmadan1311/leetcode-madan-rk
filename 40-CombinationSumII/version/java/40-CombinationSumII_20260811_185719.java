// Last updated: 11/08/2026, 18:57:19
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
5        List<List<Integer>> result = new ArrayList<>();
6
7        Arrays.sort(candidates);
8
9        backtrack(candidates, target, 0, new ArrayList<>(), result);
10
11        return result;
12    }
13
14    private void backtrack(int[] candidates, int target, int start,
15                           List<Integer> current,
16                           List<List<Integer>> result) {
17
18        if (target == 0) {
19            result.add(new ArrayList<>(current));
20            return;
21        }
22
23        for (int i = start; i < candidates.length; i++) {
24
25            // Skip duplicate elements at the same level
26            if (i > start && candidates[i] == candidates[i - 1])
27                continue;
28
29            // Since array is sorted
30            if (candidates[i] > target)
31                break;
32
33            current.add(candidates[i]);
34
35            // i + 1 because each number can be used only once
36            backtrack(candidates, target - candidates[i],
37                      i + 1, current, result);
38
39            current.remove(current.size() - 1);
40        }
41    }
42}