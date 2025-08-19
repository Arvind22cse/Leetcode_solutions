class Solution {
    public int uniquePaths(int m, int n) {
        int[] arr=new int[n];
        Arrays.fill(arr,1);
       
        for(int i=1;i<m;i++){
             int[] current=new int[n];
            Arrays.fill(current,1);
            for(int j=1;j<n;j++){
                current[j]= current[j-1]+arr[j];
            }
            arr=current;
        }
        return arr[n-1];
    }
}