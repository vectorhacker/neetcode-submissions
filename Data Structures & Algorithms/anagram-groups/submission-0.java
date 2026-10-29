class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> anagrams = new HashMap<>();

        for (String str : strs) {
            String anagramKey = getSortedCharacters(str);
            if (anagrams.containsKey(anagramKey)) {
                anagrams.get(anagramKey).add(str);
            } else {
                anagrams.put(anagramKey, new ArrayList<>(List.of(str)));
            }
        }

        return new ArrayList<>(anagrams.values());
    }

    private String getSortedCharacters(String str) {
        char characters[] = str.toCharArray();
        Arrays.sort(characters);
        return new String(characters);
    }
}