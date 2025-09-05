class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] a = ransomNote.toCharArray();
        char[] b = magazine.toCharArray();
        // Arrays.sort(a);
        // Arrays.sort(b);
        // int n=ransomNote.length();
        // int m=magazine.length();
        // int l=0,c=0;
        // while(l<n){
        //     if(a[l]==b[l]){
        //         c++;
        //     }
        //     l++;
        // }
        // if(c==n){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            if(!hm.containsKey(ch)||hm.get(ch)==0)return false;
            else hm.put(ch,hm.getOrDefault(ch,0)-1);
        }
        return true;

    }
}