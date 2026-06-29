class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num: nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        int[]ans = new int[k];

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort((a,b)-> b.getValue()-a.getValue());

        for(int i=0; i<k; i++){
            ans[i] = list.get(i).getKey();
        }
        return ans;
    }
}
