class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i],0)+1);
        }
        for(int key : freq.keySet()){
            if(freq.get(key)>n/3){
                ans.add(key);
            }
        }
        return ans;
    }
}