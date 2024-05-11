import java.util.*;
import java.lang.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(mp.containsKey(complement))
                return new int[] {mp.get(complement), i};
            mp.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Example input
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Call the twoSum method and print the result
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: " + Arrays.toString(result));
    }
}