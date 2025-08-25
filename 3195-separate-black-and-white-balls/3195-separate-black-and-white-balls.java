class Solution {
    public long minimumSteps(String s) {
        int p1=0,p2;
        long c=0;
        while(p1<s.length()&&s.charAt(p1)=='0') p1++;
        p2=p1+1;
        while(p2<s.length()) {
            if(s.charAt(p2)=='0') {
                c+=(p2-p1);
                p1++;
            }
            p2++;
        }
        return c;
    }
}