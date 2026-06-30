class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for(int num:nums){
            seen.add(num);
        }
        int n = nums.length;
        for(int i=1; i<=n+1; i++){
            if(!seen.contains(i)){
                return i;
            }
        }
        return -1;
    }
}