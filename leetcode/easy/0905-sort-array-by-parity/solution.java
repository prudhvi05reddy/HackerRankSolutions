class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer>  even = new ArrayList<>();
        ArrayList<Integer>  odd = new ArrayList<>();
        for(int num: nums){
            if(num % 2 == 0){
                even.add(num);
            }
            if(num % 2 != 0){
                odd.add(num);
            }
        }
        int[] arr = new int[nums.length];
        int c = 0;
        for(int num:even){
            arr[c] = num;
            c++;
        }
        for(int num:odd){
            arr[c] = num;
            c++;
        }
            
         return arr;
    }

}