class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> sk = new Stack<>();
        int max=0;
        if(s.length()==0){
            return 0;
        }
        sk.push(-1);
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                sk.push(i);
            }
            else{
                sk.pop();
                if(sk.empty()){
                    sk.push(i);
                }
                else{
                 max=Math.max(max,i-sk.peek());
                }
            }
        }
        return max;
        
        // else{
        //     i++;
        // }


        // }
        // return c;
    }
}