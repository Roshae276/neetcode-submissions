class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int product = 1;
        int[]ans = new int[n];
        int count0 = 0;
        for(int i=0; i<n; i++){
            if(nums[i] == 0)
            count0++;
            else{
                product = product*nums[i];
            }
        }
        for(int i=0; i<n; i++){
           if(count0 == 0)
            ans[i] = product/nums[i];
            else if(count0 == 1){
                for(int j=0; j<n; j++){
                    if(nums[j]==0){
                        ans[j] = product;
                    }else{
                        ans[j] = 0;
                    }
                }
            }
            
            else 
            ans[i] = 0;
        }
        return ans;
    }
}  
