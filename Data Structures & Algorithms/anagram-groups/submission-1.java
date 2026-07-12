class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
      List<List<String>> listOFList = new ArrayList<>();

        if (strs.length == 0) {
            return listOFList;
        }

        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            // Sort the characters of the string to create the key
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);

            // Group anagrams by their sorted key
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        // Add all grouped anagrams to the result list
        listOFList.addAll(map.values());

        return listOFList;
    }
}
