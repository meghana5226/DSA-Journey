package TwoPointers.problems;

public class MoveZeroes {
    // Leetcode 283: https://leetcode.com/problems/move-zeroes/
//  Move all zeroes to the end of the array while maintaining the relative order of non-zero elements.


    public void moveZeroes(int[] nums) {
        int insertPos = 0;

        // Move all non-zero elements forward
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        // Fill the remaining positions with zero
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}


