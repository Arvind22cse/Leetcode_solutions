class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        double[] arr=new double[n+m];
        int k=0;
        for(int i=0;i<n;i++){
            arr[k++]=nums1[i];
        }
        for(int i=0;i<m;i++){
            arr[k++]=nums2[i];
        }
        int len=arr.length;
        Arrays.sort(arr);
       if (len % 2 == 0) {
           
            return (arr[len / 2] + arr[(len / 2) - 1]) / 2.0;
        } else {
           
            return arr[len / 2];
        }
       

    }
}