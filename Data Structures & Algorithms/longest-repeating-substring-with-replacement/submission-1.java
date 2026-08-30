class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int right=0;
        Map<Character,Integer> map=new HashMap<>();
        int maxFreq=0;
        int n=s.length();
        int maxLen=0;


        while(right<n){
            char c=s.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);
            maxFreq=Math.max(maxFreq,map.get(c));

            int len=(right-left+1);

            if(len-maxFreq>k){
                  char leftChar=s.charAt(left);
                map.put(leftChar,map.get(leftChar)-1);
                left++;
            }else{
                maxLen=Math.max(maxLen,len);
            }
            right++;

        }
        return maxLen;
        
    }
}
