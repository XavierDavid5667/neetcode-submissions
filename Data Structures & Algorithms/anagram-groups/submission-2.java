class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] charArray=s.toCharArray();
            Arrays.sort(charArray);
            String str = new String(charArray);
            if(map.containsKey(str)){
                map.get(str).add(s);
            }else{
                List<String>list=new ArrayList<>();
                list.add(s);
                map.put(str,list);
            }
        }
        List<List<String>>ans=new ArrayList<>();
        Set<String>keys=map.keySet();
        for(String key:keys){
           ans.add(map.get(key));
        }

        return ans;
    }
}
