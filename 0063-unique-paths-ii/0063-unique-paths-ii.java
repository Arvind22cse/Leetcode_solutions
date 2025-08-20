class Solution {
    public int uniquePathsWithObstacles(int[][] o) {
        int n=o.length;
        int m=o[0].length;
        int[][] arr=new int[n][m];
        if (o[0][0]==1)return 0;
         arr[0][0]=1;
         //rows
       // First row
for (int i = 1; i < m; i++) {
    if (o[0][i] == 0 && arr[0][i - 1] == 1) {
        arr[0][i] = 1;
    }
}

// First column
for (int i = 1; i < n; i++) {
    if (o[i][0] == 0 && arr[i - 1][0] == 1) {
        arr[i][0] = 1;
    }
}

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(o[i][j]==0){
                    arr[i][j]=arr[i-1][j]+arr[i][j-1];
                }
            }

        }
        return arr[n-1][m-1];
    }
}