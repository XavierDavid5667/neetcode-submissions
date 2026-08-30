class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {

            return false;

        }

        int[] arr1 = new int[26];

        int[] arr2 = new int[26];

        // Frequency of s1

        for (char c : s1.toCharArray()) {

            arr1[c - 'a']++;

        }

        int left = 0;

        for (int right = 0; right < s2.length(); right++) {

            // Add current character to window

            arr2[s2.charAt(right) - 'a']++;

            // Keep window size equal to s1.length()

            if (right - left + 1 > s1.length()) {

                arr2[s2.charAt(left) - 'a']--;

                left++;

            }

            // Window size is now exactly s1.length()

            if (right - left + 1 == s1.length()) {

                if (Arrays.equals(arr1, arr2)) {

                    return true;

                }

            }

        }

        return false;

        
    }
}
