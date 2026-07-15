class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num,map.getOrDefault(num, 1) + 1);
        }

        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer,Integer> c : map.entrySet()) {
            arr.add(new int[]{c.getValue(), c.getKey()});
        }

        arr.sort((a,b) -> b[0] - a[0]);
        
        int[] res = new int[k];
        for(int i = 0; i < k; i++) {
            res[i] = arr.get(i)[1];
        }

        return res;
    }
}
