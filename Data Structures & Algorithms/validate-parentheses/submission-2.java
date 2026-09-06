class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }else {
                if(stack.isEmpty()){
                  return false;
              }
                char top=stack.pop();
                if(c==')'){
                    if(top=='[' || top=='{'){
                        return false;
                    }
                }else if(c==']'){
                    if(top=='(' || top=='{'){
                        return false;
                    }
                }else{
                   if(top=='(' || top=='['){
                        return false;
                    } 
                }
            }
        }

        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
