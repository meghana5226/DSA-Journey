package SlidingWindow.problems;

public class LongestRepeatingCharReplacement {
 // Problem: Longest Repeating Character Replacement
// Pattern: Variable Size Sliding Window + Frequency Count


    public static int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0, maxCount = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, freq[s.charAt(right) - 'A']);

            // if we need to replace more than k characters
            while ((right - left + 1) - maxCount > k) {
                freq[s.charAt(left++) - 'A']--;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println("Longest valid substring: " + characterReplacement(s, k));
    }
}
   

