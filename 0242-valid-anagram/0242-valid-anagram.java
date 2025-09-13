class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
           return false;
        
        int[] hash=new int[26];
        int i=0;
        while(i<s.length()){
            int x=s.charAt(i)-'a';
            ++hash[x];
            i++;
        }
        int j=0;
        while(j<t.length()){
            int y=t.charAt(j)-'a';
            --hash[y];
            j++;
        }
        for(int k=0;k<26;k++){
            if(hash[k]>0){
                return false;
            }
        }
        return true;
        
    }
}