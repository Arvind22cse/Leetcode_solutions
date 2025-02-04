class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int m = 0;
        while(left < right){
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int area = h * w;
            m = Math.max(m, area);
            if(height[left] < height[right]) left++;
            else if(height[left] > height[right]) right--;
            else {
                left++;
                right--;
            }
        }
        return m;
    }
}