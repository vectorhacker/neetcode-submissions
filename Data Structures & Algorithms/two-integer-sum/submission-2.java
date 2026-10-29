class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> compliments = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (compliments.containsKey(diff)) {
                return new int[]{compliments.get(diff), i};
            }

            compliments.put(nums[i], i);
        }

        return new int[]{};
    }
}
