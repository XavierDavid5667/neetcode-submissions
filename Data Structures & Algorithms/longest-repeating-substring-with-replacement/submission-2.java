class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int right=0;
        int n=s.length();
        Map<Character,Integer>map=new HashMap<>();
        int maxChar=0;
        int maxLen=0;

        while(right<n){
            char c=s.charAt(right);

            map.put(c,map.getOrDefault(c,0)+1);
            maxChar=Math.max(maxChar,map.get(c));
            int len=(right-left+1);

            if(len-maxChar>k){
                int charCount=map.get(s.charAt(left));
                charCount=charCount-1;
                if(charCount==0){
                    map.remove(s.charAt(left));
                }else{
                    map.put(s.charAt(left),charCount);
                }
                left++;
            }else{
             maxLen=Math.max(maxLen,len);
            }

            right++;
        }

        return maxLen;
        
    }
}
