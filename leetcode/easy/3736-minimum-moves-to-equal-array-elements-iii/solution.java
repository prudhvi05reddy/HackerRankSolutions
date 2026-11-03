class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        int ans = 0;
        int ans1 = 0;
        for(int i = 0; i<nums.length; i++){
            ans = max - nums[i];
            ans1 = ans1 + ans;
        }
        return ans1;
    }

}