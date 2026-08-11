// Last updated: 11/08/2026, 14:15:04
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty=0;
        int drank=0;
        while(numBottles>0){
            numBottles--;
            drank++;
            empty++;
         if(empty==numExchange){
            numBottles++;
            empty=0;
         }   
        }
        return drank;
        
    }
}