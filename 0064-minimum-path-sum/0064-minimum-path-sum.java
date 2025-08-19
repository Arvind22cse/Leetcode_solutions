class Solution 
{
    public int minPathSum(int[][] g) 
    {
        int m = g.length;
        int n = g[0].length;
        int i,j;
        int [][]a = new int[m][n];
        a[0][0] = g[0][0];
        for(i=1;i<n;i++)
        {
            a[0][i] = g[0][i] + a[0][i-1];
        } 
        for(i=1;i<m;i++)
        {
            a[i][0] = g[i][0] + a[i-1][0];
        }
        for(i=1;i<m;i++)
        {
            for(j=1;j<n;j++)
            {
                a[i][j] = g[i][j] + Math.min(a[i][j-1],a[i-1][j]);
            }
        }
        return a[m-1][n-1];
    }
}