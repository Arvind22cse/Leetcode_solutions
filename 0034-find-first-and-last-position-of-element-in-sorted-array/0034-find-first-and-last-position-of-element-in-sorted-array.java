class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int o=-1;
        int [] arr={-1,-1};
       while(l<=r){
        int mid=(l+r)/2;
        if(nums[mid]==target){
            o=mid;
            break;
        }
        else if(nums[mid]<target) l=mid+1;
        else r=mid-1;
       }
       if(o==-1){
        return arr;
       }
       System.out.print(o);
       int t=o;
       while(o!=0 && nums[o-1]==target){
        o--;
       }
       //o++;
       arr[0]=o;
        o=t;
       while(o!=r+1 && nums[o]==target){
        o++;
       }
       o--;
       arr[1]=o;
       return arr;
    }
}