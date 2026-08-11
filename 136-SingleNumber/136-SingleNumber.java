// Last updated: 11/08/2026, 14:18:42
class Solution {
    public int singleNumber(int[] nums) {
        int x=0;
     for(int n: nums){
     x^=n;  
    }
    return x;
    }
};