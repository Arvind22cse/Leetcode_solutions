class Solution {
    public int removeDuplicates(int[] nums) {
        // int i=1 ,j=1
        // 1,1 
        int j=0;
        int c=0;
        int n=nums.length;
        //0 0 1 1 1 2 2 3 3 4
        //0<0
        //0<1
        //0 1 
        // 1<1
        //1<2
        //0 1 2
        //2<2
        //2<3
        //0 1 2 3
        //3<3
        //3<4
        //0 1 2 3 4

        for(int i=1;i<n;i++){

            if(nums[j]<nums[i]){
                nums[j+1]=nums[i];
                j++;
            }
        
        }
        return j+1;
    }
}