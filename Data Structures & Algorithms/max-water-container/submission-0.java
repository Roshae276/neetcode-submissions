class Solution {
    public int maxArea(int[] heights) {
        int ans = 0;
        int maxAns = 0;
        int n = heights.length;
        int i=0;
        int j = n-1;
        while(i<j){
            ans = (j-i)*Math.min(heights[i],heights[j]);

            if(heights[i]<heights[j]){
                i++;
            }else{
                j--;
            }

            maxAns = Math.max(maxAns,ans);
        }
        return maxAns;
    }
}
