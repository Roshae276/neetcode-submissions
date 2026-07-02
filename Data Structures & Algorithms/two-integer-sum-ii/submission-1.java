class Solution {
    public int[] twoSum(int[] numbers, int target) {
        List<Integer> list = new ArrayList<>();
        int n = numbers.length;
        int l = 0;
        int r = n-1;
        while(l<r){
            int sum = numbers[l]+numbers[r];
            if(sum == target){
                list.add(l+1);
                list.add(r+1);
                l++;
                r--;

                while(l<r && numbers[l]==numbers[l-1]){
                    l++;
                }
                while(l<r && numbers[r]==numbers[r+1]){
                    r--;
                }
        
            }
            else if(sum<target){
                l++;
            }
            else{
                r--;
            }
        }
        int[]ans = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
