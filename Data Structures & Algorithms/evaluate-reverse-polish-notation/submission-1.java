class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token: tokens)
        {
            try{

                stack.push(Integer.parseInt(token));
            }
            catch(NumberFormatException e)
            {
                int a = stack.pop();
                int b = stack.pop();
                if(token.equals("+"))
                {
                    stack.push(a+b);
                }
                if(token.equals("-"))
                {
                    stack.push(b-a);
                }
                if(token.equals("*"))
                {
                    stack.push(a*b);
                }
                if(token.equals("/"))
                {
                    stack.push(b/a);
                }

            }
        }
        return stack.peek();
        
    }
}
