class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n  = arr.length;
        List<Integer> ans = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> {
                if(a[1] != b[1]){
                    return Integer.compare(b[1],a[1]);
                }
                return Integer.compare(b[0],a[0]);
            }
        );

        for(int i=0; i<n; i++){
            int cal = Math.abs(arr[i]-x);
            pq.add(new int[]{arr[i],cal});
            if(pq.size()>k){
                pq.poll();
                
            }
        }
        while(!pq.isEmpty()){
            ans.add(pq.poll()[0]);
        }
        Collections.sort(ans);
        return ans;

    }
}