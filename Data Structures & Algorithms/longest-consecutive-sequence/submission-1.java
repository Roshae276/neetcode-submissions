class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int len = 0;
        int curr = 0;
        int maxlen = 0;

        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i]-1)){
                continue;
            }else{
                len = 1;
                curr = nums[i];

                int req = curr + 1;
                while(set.contains(req)){
                    len++;
                    curr++;
                    req = curr + 1;
                }
                maxlen = Math.max(maxlen , len);
            }
            
        }
        return maxlen;
    }
}
