// Last updated: 11/08/2026, 19:00:29
1class Solution {
2    public int[] sortArrayByParity(int[] nums) {
3        int left = 0;
4        int right = nums.length - 1;
5
6        while (left < right) {
7
8            while (left < right && nums[left] % 2 == 0) {
9                left++;
10            }
11
12            while (left < right && nums[right] % 2 == 1) {
13                right--;
14            }
15
16            if (left < right) {
17                int temp = nums[left];
18                nums[left] = nums[right];
19                nums[right] = temp;
20            }
21        }
22
23        return nums;
24    }
25}