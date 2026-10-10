// Last updated: 10/10/2026, 09:03:41
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> subsetsWithDup(int[] nums) {
5        List<List<Integer>> result = new ArrayList<>();
6        Arrays.sort(nums);
7        backtrack(nums, 0, new ArrayList<>(), result);
8        return result;
9    }
10
11    void backtrack(int[] nums, int start, List<Integer> temp,
12                   List<List<Integer>> result) {
13        result.add(new ArrayList<>(temp));
14
15        for (int i = start; i < nums.length; i++) {
16            if (i > start && nums[i] == nums[i - 1]) {
17                continue;
18            }
19
20            temp.add(nums[i]);
21            backtrack(nums, i + 1, temp, result);
22            temp.remove(temp.size() - 1);
23        }
24    }
25}