package TwoPointers.problems;

public class TwoSumSorted {
    // Leetcode 167: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
//  Given a sorted array, find two numbers that add up to target using two pointers.


    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                // +1 because question wants 1-based index
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++; // move right to increase sum
            } else {
                right--; // move left to decrease sum
            }
        }

        return new int[]{-1, -1}; // not found
    }
}
