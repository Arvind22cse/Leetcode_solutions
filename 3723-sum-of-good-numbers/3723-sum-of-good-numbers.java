class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        /*
             1 3 2 1 5 4
             nums[0+2]=2
             2<1 

             nums[1+2]=1 
             3>1 && nums[i-2]=-1 3>-1 s+=3

             nums[2+2]=4
             2>

             nums[3+2]


        */
        int n=nums.length;
        int s=0;
        for (int i=0;i<n;i++){
            if(i-k<0){
                if(nums[i+k]<nums[i] ){
                    s+=nums[i];
                }   
            }
            if((i+k)>n-1){
                if(nums[i-k]<nums[i] ){
                    s+=nums[i];
                }
                
            }
            if(i+k<n && i-k>=0){
            if(nums[i+k]<nums[i]&& nums[i-k]<nums[i] ){
                // if (i + k < n && i - k >= 0 &&
                // nums[i + k] < nums[i] && nums[i - k] < nums[i]) { 
                s+=nums[i];
            }
        }
        }
        return s;
    }
}