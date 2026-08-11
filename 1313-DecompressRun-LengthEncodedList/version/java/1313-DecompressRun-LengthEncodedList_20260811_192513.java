// Last updated: 11/08/2026, 19:25:13
1import java.util.*;
2
3class Solution {
4    public int[] decompressRLElist(int[] nums) {
5        List<Integer> result = new ArrayList<>();
6
7        for (int i = 0; i < nums.length; i += 2) {
8            int frequency = nums[i];
9            int value = nums[i + 1];
10
11            for (int j = 0; j < frequency; j++) {
12                result.add(value);
13            }
14        }
15
16        int[] answer = new int[result.size()];
17
18        for (int i = 0; i < result.size(); i++) {
19            answer[i] = result.get(i);
20        }
21
22        return answer;
23    }
24}