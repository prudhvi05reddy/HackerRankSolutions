class Solution {
    public int maxProduct(int n) {
        
        int[] arr = String.valueOf(n).chars()
                         .map(c -> c - '0')
                         .toArray();
            Arrays.sort(arr);
            int n1=arr.length;
            int pr= (arr[n1  -1] * arr[n1-2]);
            return pr;
                    
    }
}