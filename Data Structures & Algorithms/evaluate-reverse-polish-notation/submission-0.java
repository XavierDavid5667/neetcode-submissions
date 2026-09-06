class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack=new Stack<>();
        for(String s:tokens){
             if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
               int secondNum= Integer.parseInt(stack.pop());
               int firstNum= Integer.parseInt(stack.pop());
               if(s.equals("+")){
                  int result =firstNum+secondNum;
                  stack.push(String.valueOf(result));
               }else if(s.equals("-")){
                  int result=firstNum-secondNum;
                  stack.push(String.valueOf(result));
               }else if(s.equals("*")){
                  int result =firstNum*secondNum;
                  stack.push(String.valueOf(result));
               }else{
                  int result =firstNum/secondNum;
                  stack.push(String.valueOf(result));
               }
             }else{
                stack.push(s);
             }
        }
        return Integer.parseInt(stack.peek());

        
    }
}
