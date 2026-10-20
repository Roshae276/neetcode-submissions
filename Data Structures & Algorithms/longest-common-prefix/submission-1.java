class Solution {
    public static String common(String s1 , String s2){
        int n = Math.min(s1.length(), s2.length());
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<n; i++){
            if(s1.charAt(i) == s2.charAt(i)){
                ans.append(s1.charAt(i));
            }
            else{
                break;
            }
        }
        return ans.toString();
    }
    public String longestCommonPrefix(String[] strs) {
        String comparewith = strs[0];
        for(int i=1; i<strs.length; i++){
            comparewith = common(comparewith, strs[i]);
        }
        return comparewith;
    }
}