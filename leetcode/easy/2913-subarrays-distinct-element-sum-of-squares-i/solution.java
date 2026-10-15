class Solution {
    public int sumCounts(List<Integer> nums) {
     int n = nums.size();
     int total=0;

     for(int i=0;i<n;i++){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int j=i;j<n;j++){
            map.put(nums.get(j), map.getOrDefault(nums.get(j), 0) + 1);

            int distinctCount = map.size();
            total += (long) distinctCount * distinctCount;
        }
     }
     return total;
    }
}