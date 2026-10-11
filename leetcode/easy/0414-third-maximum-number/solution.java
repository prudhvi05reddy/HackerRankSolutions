class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

    int[] arr = new int[set.size()];
    int i=0;
    for(int num : set){
        arr[i]=num;
        i++;
    }
    Arrays.sort(arr);
    if(arr.length > 2){
        return arr[arr.length - 3];
    }
    else{
        return arr[arr.length - 1];
    }
    }
}
