class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int min=0,max=0,area=0;
        while(l<r){
            min=Math.min(height[l],height[r]);
            area=min*(r-l);
            if(height[l]<height[r]){
                int x=l;
                while(l<r&&height[x]>=height[l]) {
                    l++;
                }
            }
            else{
                int x=r;
                while(l<r&&height[x]>=height[r]) {
                    r--;
                }
            }
            max=Math.max(max,area);
        }
        return max;
    }
}