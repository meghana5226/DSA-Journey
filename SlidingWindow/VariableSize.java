// Variable Size Sliding Window - Longest Substring Without Repeating Characters

import java.util.*;

public class VariableSize {

    // Function to find the length of the longest substring without repeating characters
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();  // to store unique characters in current window
        int left = 0;                             // left boundary of window
        int maxLength = 0;                        // store maximum length found

        // Step through the string with right pointer
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);   // get the character at the right pointer

            // If character is already in the window, shrink from the left until it's gone
            while (window.contains(currentChar)) {
                window.remove(s.charAt(left));    // remove the leftmost character
                left++;                           // move left boundary forward
            }

            // Add current character to the window
            window.add(currentChar);

            // Update maxLength if current window is larger
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength; // return the longest found length
    }

    // Driver code
    public static void main(String[] args) {
        String s = "abcabcbb";  // example string
        int result = lengthOfLongestSubstring(s);  // function call
        System.out.println("Length of Longest Unique Substring: " + result);
    }
}
