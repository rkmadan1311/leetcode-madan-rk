// Last updated: 11/09/2026, 23:03:20
1class Solution {
2    public int numJewelsInStones(String jewels, String stones) {
3        int count = 0;
4
5        for (int i = 0; i < stones.length(); i++) {
6            if (jewels.indexOf(stones.charAt(i)) != -1) {
7                count++;
8            }
9        }
10
11        return count;
12    }
13}