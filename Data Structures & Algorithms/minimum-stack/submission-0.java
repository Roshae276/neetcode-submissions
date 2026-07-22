class MinStack {
    private static class Pair{
        int value;
        int min;

        Pair(int value , int min){
            this.value = value;
            this.min = min;
        }
    }
    Stack<Pair> st;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        int min = st.isEmpty() ? val: Math.min(val,st.peek().min);
        st.push(new Pair(val,min));
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().value;
    }
    
    public int getMin() {
        return st.peek().min;
    }
}
