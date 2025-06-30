package TwoPointers.problems;

public class ContainerWithMostWater {
   // Leetcode 11: https://leetcode.com/problems/container-with-most-water/
//  Find the two lines that can trap the most water using the widest + tallest container principle.


    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            // Calculate area
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;

            maxArea = Math.max(maxArea, area);

            // Move pointer with smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
 

