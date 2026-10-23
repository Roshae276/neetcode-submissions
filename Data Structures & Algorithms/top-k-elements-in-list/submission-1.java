class Pair{
    int first;
    int second;

    public Pair(int first , int second){
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x,y) -> x.first - y.first);

        for(var entry: map.entrySet()){
            int value = entry.getKey();
            int freq = entry.getValue();


            pq.offer(new Pair(freq, value));

            if(pq.size() > k){
                pq.poll();
            }
        }

        int result[] = new int[k];
        for(int i=0; i<k; i++){
            result[i] = pq.poll().second;
        }
        return result;

        
    }
}
