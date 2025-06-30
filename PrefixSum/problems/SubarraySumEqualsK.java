package PrefixSum.problems;
import java.util.*;
public class SubarraySumEqualsK {
    // Leetcode 560 - Prefix Sum + HashMap
// Count number of subarrays whose sum = k
    public int subarraySum(int[] nums, int k) {
        // Map to store prefix sum frequency
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // base case

        int sum = 0, count = 0;

        for (int num : nums) {
            sum += num;

            // If (sum - k) is already in map, add its frequency to count
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            // Store/update prefix sum in map
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}


