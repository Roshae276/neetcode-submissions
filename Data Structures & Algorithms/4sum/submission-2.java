class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);
        
        int n = nums.length;
        for(int i=0; i<n-3; i++){
               for(int j = i+1; j<n-2; j++){
                int start = j+1;
                long s = (long)target-((long) nums[i]+nums[j]);
                int end = n-1;
                while(start<end){
                    if((long)nums[start]+nums[end] == s){
                        List<Integer> quad = Arrays.asList(nums[i],nums[j],nums[start],nums[end]);
                        
                        if(!ans.contains(quad)){
                            ans.add(quad);
                        }
                        start++;
                        end--;
                    }else if(nums[start]+nums[end]>s){
                        end--;
                    }else start++;      
                    
                }

               }
        }
        return ans;
    }
}