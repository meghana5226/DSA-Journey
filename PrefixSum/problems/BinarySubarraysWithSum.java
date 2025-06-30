package PrefixSum.problems;
import java.util.*;
public class BinarySubarraysWithSum {

    // Leetcode 930 - Count number of binary subarrays with sum = goal
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // base case

        int sum = 0, count = 0;

        for (int num : nums) {
            sum += num;

            count += map.getOrDefault(sum - goal, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}


