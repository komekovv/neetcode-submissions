class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++) {
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int left = i + 1, right = nums.length - 1;
            int target = -nums[i];
            while(left < right) {
                if(nums[left] + nums[right] == target) {
                    List<Integer> r = List.of(nums[i], nums[left], nums[right]);
                    res.add(r);

                    left++;
                    right--;

                    while(left < right && nums[left] == nums[left-1]) left++;
                    while(left < right && nums[right] == nums[right+1]) right--;
                } else if(nums[left] + nums[right] < target) left++;
                else right--;
            }
        }


        return res;
    }
}
