class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int [] result = new int[n];
        for(int i=0;i<nums.length;i++){
            result[i] = nums[i]*nums[i];
        }
        Arrays.sort(result);
         return result;
    }
}