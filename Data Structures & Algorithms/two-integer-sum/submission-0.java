class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];

            if(numsMap.containsKey(nums[i])) {
                return new int[]{numsMap.get(nums[i]), i};
            }

            numsMap.put(compliment, i);
        }

        return new int[]{};
    }
}
