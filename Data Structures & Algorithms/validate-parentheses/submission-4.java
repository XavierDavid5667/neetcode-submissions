class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        char[] charArray=s.toCharArray();
        int n=charArray.length;


        for(int i=0;i<n;i++){
            char c=charArray[i];
            if(c=='{' || c=='[' || c=='('){
                stack.push(c);
            }else{
                char top;
                if(stack.isEmpty()){
                   return false;
                }else{
                    top =stack.pop();
                }
            
               if(c=='}'){
        
                  if(top=='[' || top=='('){
                    return false;
                  }
               }else if(c==']'){
                  if(top=='{' || top=='('){
                    return false;
                  }

               }else{
                if(top=='{' || top=='['){
                    return false;
                  }
               }

            }
        }
        return stack.isEmpty();
        
    }
}
