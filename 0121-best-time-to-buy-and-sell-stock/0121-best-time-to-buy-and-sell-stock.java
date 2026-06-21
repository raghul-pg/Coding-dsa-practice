class Solution {
    public int maxProfit(int[] prices) {
        int minpri = Integer.MAX_VALUE;
        int maxpro = 0;
        for(int i=0;i<prices.length;i++){
            if (prices[i]<minpri){
                minpri=prices[i];
            }
            else if(prices[i]-minpri>maxpro){
                maxpro = prices[i]-minpri;
            }
        }
        return maxpro;
        
    }
}