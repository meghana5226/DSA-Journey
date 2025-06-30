// Fixed Size Sliding Window - Find maximum sum of a subarray of size K

public class FixedSize {

    // Function to find maximum sum of a subarray of size k
    public static int maxSum(int[] arr, int k) {
        int sum = 0;        // current window sum
        int maxSum = 0;     // to store the maximum sum seen so far

        // Step 1: Calculate the sum of the first 'k' elements
        for (int i = 0; i < k; i++) {
            sum += arr[i];  // add each of the first k elements
        }

        maxSum = sum;       // initialize maxSum with the first window sum

        // Step 2: Slide the window one element at a time
        for (int i = k; i < arr.length; i++) {
            sum += arr[i];        // add the new element coming into the window
            sum -= arr[i - k];    // remove the element that is sliding out of the window
            maxSum = Math.max(maxSum, sum); // update maxSum if current sum is higher
        }

        return maxSum;  // return the highest sum found
    }

    // Driver code to test the function
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};  // example array
        int k = 3;                       // window size

        int result = maxSum(arr, k);    // call the function
        System.out.println("Maximum Sum of Subarray of size " + k + ": " + result);
    }
}
