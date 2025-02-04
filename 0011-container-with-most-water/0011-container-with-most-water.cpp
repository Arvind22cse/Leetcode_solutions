class Solution {
public:
    int maxArea(vector<int>& height) {
        int maxwater = 0;
        int left  = 0;
        int right = height.size()-1;
        while(left < right){
            maxwater = max(maxwater,(min(height[left],height[right])*(right - left)));
            if(height[left] > height[right]) right--;
            else left++;
        }
        return maxwater;
    }
};