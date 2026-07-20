class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int i=0;
        int j=0;
        int maxC = 0;
        HashMap<Character,Integer> freq = new HashMap<>();

        while(j<s.length()){
            freq.put(s.charAt(j), freq.getOrDefault(s.charAt(j),0)+1);
            maxC = Math.max(maxC, freq.get(s.charAt(j)));

            while((j-i+1)-maxC > k){
                freq.put(s.charAt(i), freq.get(s.charAt(i))-1);
                i++;

                for(int count:freq.values()){
                    maxC = Math.max(maxC, count);
                }

            }
            max =Math.max(max, j-i+1);
            j++;
        }
        return max;
    }
}
