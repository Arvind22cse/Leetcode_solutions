class Solution {
    public boolean isHappy(int n) {
       ArrayList<Integer> al=new ArrayList<>();
       int s=0;
       while(n!=1){
        s=0;
        while(n>0){
        int r=n%10;
        s+=(r*r);
        n/=10;
        }
        if(al.contains(s)){
            return false;
        }
        al.add(s);
         n=s;
        
       }
       return true;
    }
}