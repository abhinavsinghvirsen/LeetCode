class Solution {
    public int calculate(String s) {
       Stack<Integer> stack = new Stack<>();
        int result = 0;
        int sign = 1; 
        int number = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (Character.isDigit(c)) {
                number = number * 10 + (c - '0');
            } else if (c == '+') {
                result += sign * number;
                sign = 1;
                number = 0;
            } else if (c == '-') {
                result += sign * number;
                sign = -1;
                number = 0;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result += sign * number;
                result *= stack.pop(); 
                result += stack.pop(); 
                number = 0;
            }
        }
        
       
        result += sign * number;
        
        return result;  
    }
}