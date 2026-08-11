// Last updated: 11/08/2026, 14:19:50
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);

        int ans = 1;

        for (int num : nums) {
            if (num == ans) {
                ans++;
            }
        }

        return ans;
    }
}