class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        
       s=s.replaceAll(" ","").toLowerCase();
       int right=s.length()-1;

        while(left<right){
            while(left<right && !checkAlphaNumeric(s.charAt(left))){
                left++;
            }

            while(right>left && !checkAlphaNumeric(s.charAt(right))){
                right--;
            }
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;        
    }

    public boolean checkAlphaNumeric(char c){
        if(c>='a' && c<='z' || c>='A' && c<='Z' || c>='0' && c<='9'){
            return true;
        }
        return false;
    }
}
