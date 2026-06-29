class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(nums[i] != val){
                list.add(nums[i]);
            }
        }
        for(int i=0; i<list.size(); i++){
            nums[i] = list.get(i);
        }
        return list.size();
    }
}