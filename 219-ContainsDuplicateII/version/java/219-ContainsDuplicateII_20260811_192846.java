// Last updated: 11/08/2026, 19:28:46
1import java.util.*;
2
3class Solution {
4    public boolean containsNearbyDuplicate(int[] nums, int k) {
5        HashMap<Integer, Integer> map = new HashMap<>();
6
7        for (int i = 0; i < nums.length; i++) {
8
9            if (map.containsKey(nums[i])) {
10                int previousIndex = map.get(nums[i]);
11
12                if (i - previousIndex <= k) {
13                    return true;
14                }
15            }
16
17            map.put(nums[i], i);
18        }
19
20        return false;
21    }
22}