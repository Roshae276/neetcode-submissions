class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int n = s.length();
        if(n==0) return 0;
        int maxlen = 1;
        HashSet<Character> set = new HashSet<>();
        while(j<n){
            
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                maxlen = Math.max(maxlen , j-i+1);
                j++;      
            }else{
                
                
                set.remove(s.charAt(i));
                i++;
            }
        
        }
        return maxlen;
    }
}
