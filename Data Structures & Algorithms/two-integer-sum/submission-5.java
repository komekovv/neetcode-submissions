class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int toSearch = target - nums[i];
            if(numMap.containsKey(toSearch)) {
                return new int[]{numMap.get(toSearch), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{-1};
    }
}
