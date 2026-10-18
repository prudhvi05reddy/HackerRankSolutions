class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int a = nums[0];
        int b = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (a < nums[i]) {
                a = nums[i];
            }
            if (b > nums[i]) {
                b = nums[i];
            }
        }
        int c = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != a && nums[i] > c) {
                c = nums[i];
            }
        }
        List<Integer> result = new ArrayList<>();
        result.add(a);// largest 
        result.add(c);// second largest
        result.add(b);//smallest
        int ans = result.get(0) + result.get(1) - result.get(2);
        return ans;
    }
}