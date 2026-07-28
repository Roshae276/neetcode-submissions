class Solution {
    public int getPaths(int n,int[]dp){
        if(n==0)return 1;
        if(n<0) return 0;
        if(dp[n] != -1) return dp[n];
        int path1 = getPaths(n-1,dp);
        int path2 = getPaths(n-2,dp);
        return dp[n]=path1+path2;
    }
    public int climbStairs(int n) {
        int[]dp = new int[n+1];
        Arrays.fill(dp,-1);
        int ans = getPaths(n,dp);
        return ans;
    }
}
