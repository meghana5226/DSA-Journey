package PrefixSum.problems;

public class MinimumValuetoGetPositiveStepbyStepSum {
    // Leetcode 1413 - Prefix sum variant to keep running sum always > 0

public class MinStartValue {
    public int minStartValue(int[] nums) {
        int sum = 0;
        int min = 0;

        for (int num : nums) {
            sum += num;
            min = Math.min(min, sum);
        }

        // If min prefix sum is -3, we need at least 4 to keep sum > 0
        return -min + 1;
    }
}

}
