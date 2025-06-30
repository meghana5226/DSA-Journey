
import java.util.*;
public class FindAllAnagramsInString {
    
    // Problem: Find All Anagrams in a String
// Link: https://leetcode.com/problems/find-all-anagrams-in-a-string/
// Pattern: Fixed Size Sliding Window + Frequency Count


    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) return result;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // Build initial window
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }

        // Check first window
        if (Arrays.equals(pCount, sCount)) result.add(0);

        // Slide window
        for (int i = p.length(); i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++; // add right
            sCount[s.charAt(i - p.length()) - 'a']--; // remove left

            if (Arrays.equals(pCount, sCount)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> indices = findAnagrams(s, p);
        System.out.println("Anagram indices: " + indices);
    }
}


