class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer>hashMap1=new HashMap<>();
		Map<Character,Integer>hashMap2=new HashMap<>();
		
		 // Populate hashMap1 with character frequencies of string `s`
        for (char c : s.toCharArray()) {
            hashMap1.put(c, hashMap1.getOrDefault(c, 0) + 1);
        }

        // Populate hashMap2 with character frequencies of string `t`
        for (char c : t.toCharArray()) {
            hashMap2.put(c, hashMap2.getOrDefault(c, 0) + 1);
        }
        return hashMap1.equals(hashMap2);
        
    }
}
