// Last updated: 11/08/2026, 14:17:33
class Solution {
    public boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums);
    int i;
    for(i=1;i<nums.length;i++)
    {
        if (nums[i]==nums[i-1])
        return true;
    }    
    return false;
    }
}