class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();
        for(String word : strs){
            char[] chArray = word.toCharArray();

            Arrays.sort(chArray);
            String key = new String(chArray);

            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
