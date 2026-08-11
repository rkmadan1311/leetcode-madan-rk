// Last updated: 11/08/2026, 19:04:09
1import java.util.*;
2
3class Solution {
4    public boolean checkIfExist(int[] arr) {
5        Set<Integer> set = new HashSet<>();
6
7        for (int num : arr) {
8            if (set.contains(2 * num) || (num % 2 == 0 && set.contains(num / 2))) {
9                return true;
10            }
11            set.add(num);
12        }
13
14        return false;
15    }
16}