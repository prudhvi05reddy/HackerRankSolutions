class Solution {
    public int[] sortByBits(int[] arr) {
        int n=arr.length;
        int[] nums = new int[n];
         for(int i=0;i<n;i++){
            nums[i]=Integer.bitCount(arr[i]);
        }
        for(int i=0;i <arr.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] > nums[j]){
                    
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    int temp1 = nums[i] ; 
                    nums[i] = nums[j];
                    nums[j] = temp1;
                }
                else if(nums[i] == nums[j] && arr[i] > arr[j]){

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    int temp1 = nums[i] ; 
                    nums[i] = nums[j];
                    nums[j] = temp1;
                }
    
            }
        }
    
        // Arrays.sort(nums);
        return arr;
    }
}