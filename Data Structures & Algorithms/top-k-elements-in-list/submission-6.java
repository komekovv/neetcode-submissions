class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums) {
            freq.put(num, freq.getOrDefault(num, 1) + 1);
        }

        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer,Integer> c : freq.entrySet()) {
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
