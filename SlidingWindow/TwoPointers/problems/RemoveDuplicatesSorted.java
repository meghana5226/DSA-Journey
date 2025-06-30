package TwoPointers.problems;

public class RemoveDuplicatesSorted {
    // Leetcode 26: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Remove duplicates in-place using two pointers.


    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;              // move unique pointer
                nums[i] = nums[j]; // update next unique value
            }
        }

        return i + 1; // length of unique elements
    }
}


