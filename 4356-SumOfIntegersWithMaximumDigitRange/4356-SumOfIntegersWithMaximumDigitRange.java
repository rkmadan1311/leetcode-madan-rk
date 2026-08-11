// Last updated: 11/08/2026, 14:13:46
class Solution {
    public int maxDigitRange(int[] nums) {
     int maxRange=0, sum=0;
        for(int x:nums)
            maxRange=Math.max(maxRange,range(x));
        for(int x:nums)
            if(range(x) == maxRange)
                sum+=x;
                return sum;
    }
    int range(int n){
        int max=0,min=9;
        while(n>0){
            int d=n%10;
            max=Math.max(max,d);
            min=Math.min(min,d);
            n/=10;
        }
        return max-min;
    
    }
}