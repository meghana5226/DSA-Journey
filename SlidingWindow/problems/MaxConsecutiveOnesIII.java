//package SlidingWindow.problems;

public class MaxConsecutiveOnesIII {
    // Problem: Max Consecutive Ones III (Flip at most k zeros to 1s)
// Pattern: Variable Size Sliding Window

    public static int longestOnes(int[] nums, int k) {
        int left = 0, maxLen = 0, zeroCount = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) zeroCount++;

            while (zeroCount > k) {
                if (nums[left++] == 0) zeroCount--;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println("Max consecutive 1s with " + k + " flips: " + longestOnes(nums, k));
    }
}