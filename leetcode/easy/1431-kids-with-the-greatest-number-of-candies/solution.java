class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int gratest=candies[0];
        List<Boolean> result = new ArrayList<>(); 
        int[] arr = new int[candies.length];
        for(int i=0;i<candies.length;i++){
            if(candies[i]> gratest){
                gratest= candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i] + extraCandies >= gratest)
        {
                result.add(true);
            }
            else{
                result.add(false);
            }
            
        }
        return result;
    }
}