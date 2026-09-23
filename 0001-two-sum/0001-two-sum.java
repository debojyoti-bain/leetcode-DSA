import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Stores: number -> its index
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            // Number we need to find
            int needed = target - nums[i];

            // Check if we have already seen this number
            if (map.containsKey(needed)) {
                return new int[] { map.get(needed), i };
            }

            // Store the current number and its index
            map.put(nums[i], i);
        }

        // This won't happen because the question guarantees one solution
        return new int[] {};
    }
}
