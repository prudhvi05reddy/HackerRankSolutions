class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right =nums.length - 1;


        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                right = mid - 1;
            }
            if(nums[mid] < target){
                left = mid + 1;
            }
        }
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i] == target){
        //         return i;
        //     }
        // }
        return -1;
    }
}