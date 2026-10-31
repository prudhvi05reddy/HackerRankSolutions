class Solution {
    public int dominantIndex(int[] nums) {
    int max = nums[0];
    int ans=0;
     for(int i=0;i<nums.length;i++){
        if(nums[i] > max){
            max = nums[i];
            ans = i;
        }
     }
     int temp = nums[ans];
     nums[ans] =nums[nums.length - 1];
     nums[nums.length - 1] = temp;
     int second = nums[0];

     for(int i=0; i<nums.length - 1; i++){
          if(nums[i] > second){
            second = nums[i];
          }
     }
        if(max >=  second * 2 ){
            return ans;
        } 
    
        return -1;
    }
}