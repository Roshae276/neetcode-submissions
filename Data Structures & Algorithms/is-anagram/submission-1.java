class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char c : s.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)+1);
        }

        if(s.length() != t.length()){
            return false;
        }

        for(char ch: t.toCharArray()){
            if(!freq.containsKey(ch) || freq.get(ch)==0){
                return false;
            }

            freq.put(ch , freq.get(ch)-1);
 
        }
        return true;
        
    }
}
