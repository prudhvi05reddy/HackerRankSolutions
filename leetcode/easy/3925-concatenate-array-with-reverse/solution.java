class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[n-i-1];
        }
        int[] arr1 = new int[n+arr.length];
        for(int i=0;i<n;i++){
            arr1[i] = nums[i];
        }
        for(int i=0;i<arr.length;i++){
            arr1[nums.length+i] = arr[i];
        }
        return arr1;
    }
}