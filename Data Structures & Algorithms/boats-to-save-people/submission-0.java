class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count = 0;
        int n = people.length;
        int i=0;
        int j = n-1;
        Arrays.sort(people);
        while(i<=j){
            if(people[i]+people[j] <= limit){
                count++;
                i++;
                j--;
            }else{
                j--;
                count++;
            }
        }
        
        
        return count;
    }
}