// Max sum of subarray of size K
public int maxSum(int[] arr, int k) {
    int sum = 0, maxSum = 0;
    for (int i = 0; i < k; i++) sum += arr[i];
    maxSum = sum;
    for (int i = k; i < arr.length; i++) {
        sum += arr[i] - arr[i - k];
        maxSum = Math.max(maxSum, sum);
    }
    return maxSum;
}
