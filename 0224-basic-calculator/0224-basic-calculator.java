class Solution {
    public int calculate(String s) {
        int result = 0;
        int sign = 1;  // +1 means add, -1 means subtract
        Stack<Integer> stack = new Stack<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                int num = 0;
                // Build the full number (may have multiple digits)
                while (i < n && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--; // adjust because for loop will increment i
                result += num * sign;
            }
            else if (c == '+') {
                sign = 1;
            }
            else if (c == '-') {
                sign = -1;
            }
            else if (c == '(') {
                // Push current result and sign to stack
                stack.push(result);
                stack.push(sign);
                // Reset for new subexpression
                result = 0;
                sign = 1;
            }
            else if (c == ')') {
                // Pop sign and previous result
                int prevSign = stack.pop();
                int prevResult = stack.pop();
                result = prevResult + prevSign * result;
            }
            // Ignore spaces
        }

        return result;
    }
}
