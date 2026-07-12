class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        	Map<String,List<String>>map=new HashMap<>();
	
		for(String s: strs) {
           int[] count=new int[26];
			for(char c: s.toCharArray()) {
				count[c-'a']++;
			}
			
			StringBuilder stringBuilder=new StringBuilder();
			for(int freq:count) {
				stringBuilder.append(freq).append("#"); 
			}
			String key = stringBuilder.toString();
			map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);

		}
		return new ArrayList<>(map.values());

    }
}
