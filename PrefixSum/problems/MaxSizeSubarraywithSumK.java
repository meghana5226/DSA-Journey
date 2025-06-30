package PrefixSum.problems;
import java.util.*;
public class MaxSizeSubarraywithSumK{
    // Leetcode 325 - Longest subarray with sum = k




    public int maxSubArrayLen(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        // Store prefix sum and its first index
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == k) maxLen = i + 1;

            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }

            // Only store first occurrence
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}


