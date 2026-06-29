class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        
        HashMap<String, List<String>> map = new HashMap<>();
             
            for(String word : strs){
                char []org = word.toCharArray();
                Arrays.sort(org);
                String sorted = new String(org);

                map.putIfAbsent(sorted, new ArrayList<>());
                map.get(sorted).add(word);
            }
        
        return new ArrayList<>(map.values());
    }
}
