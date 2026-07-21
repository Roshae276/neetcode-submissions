class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<asteroids.length; i++){
            boolean live = true;
            while(asteroids[i]<0 && !st.isEmpty() && st.peek()>0){
                if(Math.abs(asteroids[i]) > st.peek()){
                    st.pop();

                }else if(Math.abs(asteroids[i]) < st.peek()){
                    live = false;
                    break;
                }else{
                    st.pop();
                    live = false;
                    break;
                }
            }
            if(live == true){
                st.push(asteroids[i]);
            }
        }
        int m = st.size();
        int[]ans = new int[m];
        int i = m-1;
        while(!st.isEmpty()){
            ans[i] = st.pop();
            i--;
        }
        return ans;
    }
}