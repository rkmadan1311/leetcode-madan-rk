// Last updated: 11/08/2026, 14:14:35
class Solution {
    public int numberOfCuts(int n) {
     if(n==1)
     return 0;
     else if(n%2==0)
     return n/2;
     else
     return n;   
    }
}