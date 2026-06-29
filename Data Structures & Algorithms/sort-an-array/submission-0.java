class Solution {
    void mergeSort(int[]arr, int left , int right){
        int mid = (left+right)/2;
        if(left >= right) return;
        mergeSort(arr,left , mid);
        mergeSort(arr,mid+1, right);
        
        merge(arr, left , mid , right);
    }

    void merge(int[]arr , int left , int mid , int right ){
        int i = left;
        int j = mid+1;
        int k =0;
        int[]temp = new int[right-left+1];
        while(i<=mid && j<=right){
            if(arr[i]<arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=right){
            temp[k++] = arr[j++];
        }

        for(int l=0; l<temp.length; l++){
            arr[left+l] = temp[l];
        }


    }
    public int[] sortArray(int[] nums) {
        int n = nums.length;
         mergeSort(nums , 0, n-1);
         return nums;
        
    }
}