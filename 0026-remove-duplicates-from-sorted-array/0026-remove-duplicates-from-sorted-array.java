class Solution {
    public int removeDuplicates(int[] nums) {
        // int i=1;
        int j=1;
        int c=0;
        int n=nums.length;
        for(int i=0;i<n;i++){

            if(nums[i]!=nums[j-1]){
                nums[j]=nums[i];
                j++;
            }
        
        }
        return j;
    }
}