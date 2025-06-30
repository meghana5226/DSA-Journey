package PrefixSum.problems;

public class RangeSumQuery {
    // Leetcode 303 - Prefix Sum Basics
// Problem: Given an integer array nums, handle queries of sumRange(i, j)
// in O(1) using prefix sum.

class NumArray {
    private int[] prefix;

    // Constructor builds prefix sum
    public NumArray(int[] nums) {
        int n = nums.length;
        prefix = new int[n];
        if (n > 0) {
            prefix[0] = nums[0];
            for (int i = 1; i < n; i++) {
                prefix[i] = prefix[i - 1] + nums[i];
            }
        }
    }

    // Get sum in range [left, right]
    public int sumRange(int left, int right) {
        if (left == 0) return prefix[right];
        return prefix[right] - prefix[left - 1];
    }
}

}
