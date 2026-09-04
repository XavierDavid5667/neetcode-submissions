class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        }
      int minLen=Integer.MAX_VALUE;
      int startIndex=-1;

      Map<Character,Integer> map=new HashMap<>();;

      for(char c:t.toCharArray()){
           map.put(c,map.getOrDefault(c,0)+1);
      }

      int left=0;
      int right=0;
      int k=0;

      while(right<s.length()){
        char c=s.charAt(right);
        if(map.containsKey(c)){
            int count=map.get(c);
            if(count>0){
                k++;
            }
            map.put(c,count-1);
        }else{
            map.put(c,-1);
        }

        while(k==t.length()){
            if(right-left+1<minLen){
                minLen=right-left+1;
                startIndex=left;

            }

            int value= map.get(s.charAt(left));
               value++;
               if(value>0){
                  k--;
               }
               map.put(s.charAt(left),value);
               left++;
        }
           right++;
      }
       return startIndex==-1 ? "": s.substring(startIndex,startIndex+minLen);

        
    }
}
