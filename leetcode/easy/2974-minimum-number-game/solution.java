class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length; i+=2){
            int first = nums[i];
            int second = nums[i+1];
            result[i] = second;
            result[i+1] = first;
        }
        return result;
    }
}