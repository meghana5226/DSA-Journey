package TwoPointers.problems;

public class ValidPalindrome {
    // Leetcode 125: https://leetcode.com/problems/valid-palindrome/
//  Check if a string is a palindrome ignoring non-alphanumeric chars using two pointers.


    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0, right = s.length() - 1;

        while (left < right) {
            // Skip non-alphanumeric characters
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}


