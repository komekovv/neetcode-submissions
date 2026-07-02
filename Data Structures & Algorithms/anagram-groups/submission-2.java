class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagram = new HashMap<>();
        
        for(String word : strs) {
            int[] key = new int[26];
            for(int i = 0; i < word.length(); i++) {
                key[word.charAt(i) - 'a']++;
            }
            String keyStr = Arrays.toString(key);
            anagram.computeIfAbsent(keyStr, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(anagram.values());
    }
}
