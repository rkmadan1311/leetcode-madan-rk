// Last updated: 11/08/2026, 14:14:19
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int onesPicked = Math.min(numOnes, k);
        
        int remaining = k - onesPicked;
        
        int negPicked = Math.max(0, remaining - numZeros);
        
        return onesPicked - negPicked;
    }
}