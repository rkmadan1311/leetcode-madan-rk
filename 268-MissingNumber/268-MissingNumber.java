// Last updated: 11/08/2026, 14:17:15
class Solution {
    public int missingNumber(int[] nums) {
    int n,s=0,x;
    n=nums.length;
    for(int i=0;i<n;i++)
    s=s+nums[i];
    x=(n*(n+1))/2;
    return x-s;      
    }
}