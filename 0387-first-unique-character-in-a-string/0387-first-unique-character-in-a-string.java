class Solution {
    public int firstUniqChar(String s) {
     HashMap<Character,Integer>  hm=new HashMap<>();
    //  String[] arr =;
     for(char ch: s.toCharArray()){
        hm.put(ch,hm.getOrDefault(ch,0)+1);
     } 
  int i=0;
     for(char ch: s.toCharArray()){
        if(hm.get(ch)==1){
            return i;
           
        }
        i++;
     }
     return -1;
    }
}