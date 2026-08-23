// Last updated: 23/08/2026, 09:22:22
1class Solution {
2    public boolean isPalindromic(String s) {
3     StringBuilder sb=new StringBuilder();
4        for(int i=0;i<s.length();i++){
5            char c=s.charAt(i);
6            for(int j=7;j>=0;j--){
7                sb.append((c>>j)&1);
8            }
9        }
10        String binaryStr=sb.toString();
11        int left=0;
12        int right=binaryStr.length()-1;
13        while(left<right){
14            if(binaryStr.charAt(left)!=binaryStr.charAt(right)){
15                return false;
16            }
17            left++;
18            right--;
19        }
20        return true;
21    }
22}