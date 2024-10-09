import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Initialize a HashSet to store unique characters
        HashSet<Character> charSet = new HashSet<>();
        
        int left = 0;  // Left pointer of the sliding window
        int maxLength = 0;  // Store the maximum length of the substring

        // Iterate through the string with the right pointer
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If the character is already in the set, remove characters from the left
            while (charSet.contains(currentChar)) {
                charSet.remove(s.charAt(left));
                left++;  // Move the left pointer to shrink the window
            }

            // Add the current character to the set
            charSet.add(currentChar);

            // Update the maxLength with the size of the current window
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
