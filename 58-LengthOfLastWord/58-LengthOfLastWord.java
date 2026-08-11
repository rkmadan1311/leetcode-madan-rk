// Last updated: 11/08/2026, 14:19:35
class Solution {
    public int lengthOfLastWord(String s) {
    int l=0;
    int i=s.length()-1;
    while(i>=0 &&s.charAt(i)==' ')
    i--;
    while(i>=0 &&s.charAt(i)!=' ')
    {
        l++;
        i--;
    } 
    return l;

    }
}