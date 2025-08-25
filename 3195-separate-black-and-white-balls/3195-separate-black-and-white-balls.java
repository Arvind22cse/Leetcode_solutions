class Solution {
    public long minimumSteps(String s) {
        int p1=0,p2=s.length()-1;
        long c=0;
        while(p1<p2) {
            if(s.charAt(p1)=='0') p1++;
            else if(s.charAt(p2)=='1') p2--;
            else {
                c+=(p2-p1);
                p1++;
                p2--;
            }
        }
        return c;
    }
}