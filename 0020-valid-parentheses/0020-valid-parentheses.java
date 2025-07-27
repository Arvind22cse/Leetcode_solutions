class Solution {
    public boolean isValid(String s) {
        Stack <Character> sk= new Stack ();
        if(s.length()==0){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch == '{' || ch == '['){
                    sk.push(ch);
            }
            else{

            if(sk.empty())return false;
            char top = sk.peek();
            if((ch==')' && top == '(') 
            || (ch==']' && top=='[')
            ||  (ch=='}' && top=='{')
             )
             {
                sk.pop();
             }
                    else{
                        return false;
                    }
            }
        }
        return sk.isEmpty();
    }
}