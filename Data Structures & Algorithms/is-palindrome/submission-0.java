class Solution {
    public boolean isPalindrome(String s) {
     if(s==null || s.isEmpty()){
            return false;
        }
         s=s.toLowerCase().replaceAll(" ","");
        int l=0;
        int r=s.length()-1;
        while(l<r){
            while(l<r && !checkIsAlphanumeric(s.charAt(l))){
                l++;
            }
            while(l<r && !checkIsAlphanumeric(s.charAt(r))){
                r--;
            }
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
       public boolean checkIsAlphanumeric(char c){
        return (c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9');
    }
}
