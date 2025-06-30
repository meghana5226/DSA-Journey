//package SlidingWindow.problems;


    // Problem: Maximum Sum Subarray of Size K
// Link: https://leetcode.com/problems/maximum-average-subarray-i/
// Pattern: Fixed Size Sliding Window

public class MaxSumSubarrayOfSizeK {

    public static int maxSum(int[] arr, int k) {
        int sum = 0, max = 0;

        // Step 1: Get sum of first window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        max = sum;

        // Step 2: Slide the window
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k]; // slide
            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Max Sum of size " + k + " = " + maxSum(arr, k));
    }
}


