class Solution {
    public boolean checkIfPangram(String sentence) {
      char[] s = sentence.toCharArray();
      Set<Character> str = new HashSet<>();
     
     for(char x: s){
        if(x>='a' && x<='z')
        str.add(x);
        
     }
     if(str.size()==26){
        return true;
     }
     else{
    return false;
     }
    }
}