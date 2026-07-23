class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();
        for(String s : strs) {
            int[] count = new int[26];
            for(char c : s.toCharArray()) {
                count[c - 'a']++;  
            }
            String key = Arrays.toString(count);
            group.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(group.values());
    }
}
