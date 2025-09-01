class Solution 
{
    public static boolean check(String str)
    {
        int n = str.length();
        int i;
        for(i=0;i<=(n/2);i++)
        {
            if(str.charAt(i)!=str.charAt(n-1-i))
            {
                return false;
            }
        }
        return true;
    }
    public int countSubstrings(String s) 
    {
        int n = s.length();
        int i,j,c=0;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<=n;j++)
            {
                if(check(s.substring(i,j)))
                {
                    c++;
                }
            }
        }
        return c;
    }
}