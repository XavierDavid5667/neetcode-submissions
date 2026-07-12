class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;

        String str="";
        Map<Character,Integer>map=new HashMap<>();
        int maxLen=0;


        while(right<s.length()){
            if(map.containsKey(s.charAt(right)) && map.get(s.charAt(right))>=left){
               left=map.get(s.charAt(right))+1;
            }
            maxLen=Math.max(maxLen,right-left+1);
            map.put(s.charAt(right),right);
            right++;
        }
        return maxLen;
        
    }
}
