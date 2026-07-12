class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlen = Integer.MAX_VALUE;
        int sum = 0;
        int i=0;
        int j=0;
        int n = nums.length;
        while(j<n){
            sum+=nums[j];
            while(sum>=target){
                minlen = Math.min(minlen,j-i+1);
                sum -= nums[i];
                i++;
                
            }
            
            j++;
        }
        return minlen==Integer.MAX_VALUE? 0: minlen;
    }
}