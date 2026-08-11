// Last updated: 11/08/2026, 14:18:51
class Solution {
    public int maxProfit(int[] prices) {
        int mp= Integer.MAX_VALUE;
        int MP= 0;
        for (int price : prices) {
            if (price < mp) {
                mp = price;
            } else {
                MP= Math.max(MP, price - mp);
            }
        }
        return MP;
    }
}
