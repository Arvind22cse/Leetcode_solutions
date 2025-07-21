class Solution {
    public int maxProfit(int[] prices) {
        int max=prices[0];
        int[] s=new int[prices.length];
        int k=0;
        for(int i=0;i<prices.length;i++){
        if(max>prices[i]){
            max=prices[i];
        }
        s[k]=prices[i]-max;
        k++;
    }
    int maxele=0;
     for(int i=0;i<prices.length;i++){
        if(maxele<s[i]){
            maxele=s[i];
        }
     }

        return maxele;
    }
}