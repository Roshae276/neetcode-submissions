class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        for(int i=0; i<s.length(); i++){
            int maxC = 0;
            HashMap<Character,Integer> freq = new HashMap<>();
            for(int j=i; j<s.length(); j++){
                freq.put(s.charAt(j), freq.getOrDefault(s.charAt(j),0)+1);

                maxC = Math.max(maxC, freq.get(s.charAt(j)));

                int ops= (j-i+1) - maxC;
                if(ops > k){
                    break;
                }
                max = Math.max(max,j-i+1);
            }
        }
        return max;
    }
}
