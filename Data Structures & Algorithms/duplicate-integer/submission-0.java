class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> seenIndexes = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (seenIndexes.containsKey(nums[i])) {
                return true;
            }

            seenIndexes.put(nums[i], i);
        }

        return false;
    }
}