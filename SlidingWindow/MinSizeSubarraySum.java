//package SlidingWindow.problems;

public class MinSizeSubarraySum {
    // Problem: Minimum Size Subarray Sum
// Pattern: Variable Size Sliding Window
// Time: O(n), Space: O(1)


    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0, sum = 0, minLen = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right]; // expand window

            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1); // update result
                sum -= nums[left++]; // shrink window
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println("Min size subarray: " + minSubArrayLen(target, nums));
    }
}

