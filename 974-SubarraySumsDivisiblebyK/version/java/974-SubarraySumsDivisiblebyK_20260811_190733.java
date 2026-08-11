// Last updated: 11/08/2026, 19:07:33
1import java.util.*;
2
3class Solution {
4    public int subarraysDivByK(int[] nums, int k) {
5        int count = 0;
6        int prefixSum = 0;
7
8        int[] remainder = new int[k];
9        remainder[0] = 1;
10
11        for (int num : nums) {
12            prefixSum += num;
13
14            int rem = prefixSum % k;
15
16            if (rem < 0) {
17                rem += k;
18            }
19
20            count += remainder[rem];
21            remainder[rem]++;
22        }
23
24        return count;
25    }
26}