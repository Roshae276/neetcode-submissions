class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for(String word : strs){
            result.append(word.length()+"#"+word);
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        while(i<str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }

            int len = Integer.parseInt(str.substring(i,j));
            String word = str.substring(j+1, j+1+len);
            ans.add(word);

            i = len+j+1;
        }
        return ans;
    }
}
