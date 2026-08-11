// Last updated: 11/08/2026, 14:20:25
class Solution {
    public boolean isPalindrome(int x) {
        int ans = 0;
        int temp = x;
        if(x>0){
        while(x!=0){
            int d = x%10;
            ans = ans*10+d;
            x = x/10;
        }
        }
        if(temp==ans)
           return true;
        else
           return false;   
    }
}