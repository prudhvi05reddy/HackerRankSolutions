class Solution {
    public int maximumProduct(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int num : nums){
            result.add(num);
        }
        Collections.sort(result);
        int n=result.size();
        int max1=result.get(n-1)*result.get(n-2)*result.get(n-3);
        int max2 = result.get(0)*result.get(1)*result.get(n-1);
        return Math.max(max1, max2);
    }
}