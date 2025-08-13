class Solution {
    public String reverseVowels(String s) {
        int l=0;
        int r=s.length()-1;
        char[] a=s.toCharArray();
        while(l<r){
            if(!isVowel(a[l])){
              l++;  
            }
            if(!isVowel(a[r])){
                r--;
            }
            if(isVowel(a[l]) && isVowel(a[r])){
               char t=a[l];
               a[l]=a[r];
               a[r]=t;
               l++;
               r--;
            }
           
        }
        String str = new String(a);
        return str;
    }
    static boolean isVowel(char b){  
        b=Character.toLowerCase(b);
      if(b=='a'|| b=='e' || b=='i' || b=='o' || b=='u'){
        return true;
      }
      return false;
    }
}