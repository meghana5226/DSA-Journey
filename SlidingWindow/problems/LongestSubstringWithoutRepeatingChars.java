package SlidingWindow.problems;

import java.util.*;

public class LongestSubstringWithoutRepeatingChars {
    // Problem: Longest Substring Without Repeating Characters
// Pattern: Variable Size Sliding Window + HashSet




    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            while (set.contains(c)) {
                set.remove(s.charAt(left++)); // shrink until unique
            }

            set.add(c); // expand window
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Longest unique substring length: " + lengthOfLongestSubstring(s));
    }
}

    

