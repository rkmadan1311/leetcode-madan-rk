// Last updated: 11/08/2026, 14:17:19
class Solution {
    public int addDigits(int num) {
     int n,d,sum;
     while(num>9){
        sum=0;
        while(num!=0){
            d=num%10;
            sum=sum+d;
            num=num/10;
        }
        num=sum;
     } 
     return num;  
    }
}