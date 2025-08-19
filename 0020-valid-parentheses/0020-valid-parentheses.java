class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char x:s.toCharArray()){
            if(x=='('||x=='['||x=='{'){
                st.push(x);
            }
            else {
                if(st.isEmpty())return false;
                if(x==')'&& st.peek()=='('||
                x==']'&& st.peek()=='['||
                x=='}' && st.peek()=='{'
                ){
                st.pop();}
                else{
                    return false;
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }

      
    }
}