class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer>freq = new HashMap<>();
        for(int i=0; i<n; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i],0)+1);
        }

        for(int i=0; i<n; i++){
            if(freq.get(nums[i])>n/2){
                return nums[i];
            }
        }
        return -1;
    }
}