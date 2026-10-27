class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.isEmpty()){
            return 0;
        }

        int left=0;
        int right=0;
        Map<Character,Integer>map=new HashMap<>();
        int maxLen=1;


        while(right<s.length()){
             char ch = s.charAt(right);

            if (map.containsKey(ch)) {
                left = Math.max(left, map.get(ch) + 1);
            }

            map.put(ch, right);

            maxLen = Math.max(maxLen, right - left + 1);

            right++;
          
        }
        return maxLen;
        
    }
}
