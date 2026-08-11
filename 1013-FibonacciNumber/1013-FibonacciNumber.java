// Last updated: 11/08/2026, 14:15:42
class Solution {
    public int fib(int n) {
    if(n==0) return 0;
    if(n==1) return 1;
    int n1=0,n2=1;
    for(int i=2;i<=n;i++){
       int f=n1+n2;
    n1=n2;
    n2=f;    
    }
    return n2;

    }}