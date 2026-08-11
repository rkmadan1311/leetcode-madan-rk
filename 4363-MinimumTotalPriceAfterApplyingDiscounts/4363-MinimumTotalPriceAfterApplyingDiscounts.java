// Last updated: 11/08/2026, 14:13:40
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double totalSum=0;
        int pldx=prices.length-1;
        int dldx=discounts.length-1;
        while(pldx >=0 && dldx >=0){
            totalSum+=prices[pldx]*(1.0-discounts[dldx]/100.0);
            pldx--;
            dldx--;
        }
        while(pldx>=0){
            totalSum+=prices[pldx];
            pldx--;
        }
        return totalSum;
    }
}