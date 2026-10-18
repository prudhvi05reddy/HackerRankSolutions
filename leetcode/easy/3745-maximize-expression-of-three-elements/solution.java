class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        // int a = Integer.MIN_VALUE;
        // int b = Integer.MAX_VALUE;
        // int c = Integer.MIN_VALUE;
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] > a) {
        //         c = a;
        //         a = nums[i];
        //     }
        //     else if (nums[i]>c) {
        //         c = nums[i];
        //     }
        //     if(nums[i] < b){
        //         b=nums[i];
        //     }
        // }
        // return a+c-b;
        // int c = Integer.MIN_VALUE;
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] > c && (nums[i] != a || c == Integer.MIN_VALUE)) {
        //         c = nums[i];
        //     }
        // }
        // List<Integer> result = new ArrayList<>();
        // result.add(a);// largest 
        // result.add(c);// second largest
        // result.add(b);//smallest
        // int ans = result.get(0) + result.get(1) - result.get(2);
        // return ans;
        int n=nums.length;
        Arrays.sort(nums);
        int ans=nums[n-1]+nums[n-2]-nums[0];
        return ans;
    }
}