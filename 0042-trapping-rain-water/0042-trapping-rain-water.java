class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int[] arr1 = new int[n]; // left max
        int[] arr2 = new int[n]; // right max

        int max1 = height[0];
        for (int i = 1; i < n; i++) {
            max1 = Math.max(max1, height[i - 1]);
            arr1[i] = max1;
        }

        int max2 = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            max2 = Math.max(max2, height[i + 1]);
            arr2[i] = max2;
        }

        int s = 0;
        for (int i = 0; i < n; i++) {
            int minH = Math.min(arr1[i], arr2[i]);
            if (minH > height[i]) {
                s += minH - height[i];
            }
        }
        return s;
    }
}
