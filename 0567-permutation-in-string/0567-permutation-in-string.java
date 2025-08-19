class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] arr=new int[26];
        int c=0;
        for(int i=0;i<s1.length();i++) {
            c=c+(++arr[s1.charAt(i)-'a']==1?1:0);
        }
        for(int i=0;i<s1.length();i++) {
            if(--arr[s2.charAt(i)-'a']==0) {
                c=c-1;
            }
            else if(arr[s2.charAt(i)-'a']==-1) {
                c=c+1;
            }
        }
        if(c==0) return true;
        int p1=1,p2=s1.length();
        while(p2<s2.length()) {
            if(++arr[s2.charAt(p1-1)-'a']==0) {
                c=c-1;
            }
            else if(arr[s2.charAt(p1-1)-'a']==1) {
                c=c+1;
            }

            if(--arr[s2.charAt(p2)-'a']==0) {
                c=c-1;
            }
            else if(arr[s2.charAt(p2)-'a']==-1) {
                c=c+1;
            }

            if(c==0) return true;

            p1++;
            p2++;
        }
        return c==0;
    }
}