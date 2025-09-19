class Solution {
    public String longestPalindrome(String s) {
        int max=0;
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(ispalindrome(s.substring(i,j+1))&&max<(j-i+1)){
                    max=j-i+1;
                    ans=s.substring(i,j+1);
                }
            }
        }
        return ans;
    }
    static boolean ispalindrome(String s){
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}