class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        List<Integer>[] bucket = new ArrayList[n+1];
        for(int value : map.keySet()){
            int freq = map.get(value);

            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(value);
        }

        int result[]= new int[k];
        int idx = 0;
        for(int i=bucket.length-1; i>=0; i--){
            if(bucket[i] != null){
                for(int v:bucket[i]){
                    result[idx++] = v;
                    if(idx == k) return result;
                }
            }
        }
        return result;


    }
}
