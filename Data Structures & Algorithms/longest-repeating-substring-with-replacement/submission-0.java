class Solution {
    public int characterReplacement(String s, int k) {
   int left = 0;

        int maxFreq = 0;

        int maxLength = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // Add current character

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // Maximum frequency inside current window

            maxFreq = Math.max(maxFreq, map.get(ch));

            // Number of replacements required

            int replacements = (right - left + 1) - maxFreq;

            // Window is invalid

            if (replacements > k) {

                char leftChar = s.charAt(left);

                map.put(leftChar, map.get(leftChar) - 1);

                left++;

            }

            // Current window is valid

            maxLength = Math.max(maxLength, right - left + 1);

        }

        return maxLength;
        
    }
}
