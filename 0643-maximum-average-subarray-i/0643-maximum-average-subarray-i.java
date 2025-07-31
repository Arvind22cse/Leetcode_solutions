class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length==1){
            return (double) nums[0];
        }
        int s=0;
        for(int i=0;i<k;i++){
            s+=nums[i];
        }
        int max = s;
        for(int i=k;i<nums.length;i++){
            s+=nums[i]-nums[i-k];
            max=Math.max(max,s);
        }
        return (double) max/k;
    }
}