class Solution {
    public long minimumSteps(String s) {
        char[] arr=s.toCharArray();
        int[] arr2=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i]-'0';
        }
        long c=0;
        // for(int i=0;i<arr2.length;i++){
        //     for(int j=0;j<arr2.length-1-i;j++){
        //         if(arr2[j]>arr2[j+1]){
        //             int t=arr2[j];
        //             arr2[j]=arr2[j+1];
        //             arr2[j+1]=t;
        //             c++;
        //         }
        //     }
        // }
        int l=0;
        int r=arr2.length-1;
        while(l<r){
            if(arr2[l]==0){
                l++;
            }
            else if(arr2[r]==1){
                r--;
            }
            else{
                
                c+=(r-l);
                l++;
                r--;
            }
        }
        return c;
    }
}