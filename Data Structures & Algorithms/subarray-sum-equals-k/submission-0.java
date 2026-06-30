class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> ps = new HashMap<>();
        ps.put(0,1);
        int prefixSum = 0;
        int count = 0;
        for(int num:nums){
           prefixSum += num;
           int req = prefixSum - k;

           if(ps.containsKey(req)){
            count += ps.get(req);
           }
           ps.put(prefixSum , ps.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}