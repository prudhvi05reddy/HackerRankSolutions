class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int num : nums){
            if(num % 2 == 0){
                even.add(num);
            }
            else{
                odd.add(num);
            }
        }
        int evn = 0;
        int od = 0;
        for(int i = 0 ;i<nums.length; i++){
                if( i % 2 ==0){
                    nums[i] = even.get(evn++);
                }
                else{
                    nums[i] = odd.get(od++);
                }
        }
            return nums;
    }
}