// Last updated: 11/08/2026, 14:15:22
class Solution {
    public int tribonacci(int n) {
    if(n==0) return 0;
    if(n==1) return 1;
    int n1=0,n2=1,n3=1;
    for(int i=3;i<=n;i++){
        int f=n1+n2+n3;
        n1=n2;
        n2=n3;
        n3=f;
    }   
    return n3;
    }
}