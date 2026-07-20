class Solution {
    public int calPoints(String[] operations) {
        int ans = 0;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("+")){
                int first = st.pop();
                int second = st.peek();
                st.push(first);
                int sum = first+second;
                st.push(sum);
            }else if(operations[i].equals("C")){
                st.pop();
            }else if(operations[i].equals("D")){
                int doubles = st.peek()*2;
                st.push(doubles);
            }else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        while(st.size() != 0){
            ans += st.pop();
        }
        return ans;
    }
}