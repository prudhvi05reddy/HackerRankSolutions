class Solution {
    public int secondHighest(String s) {
       String numbers ="";
       for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                numbers= numbers + ch;
            }
        }
        if (numbers.length() < 2) {
          return -1;
}
        char[] arr = numbers.toCharArray();
        Arrays.sort(arr);
        numbers = new String(arr); 
        int result = arr[arr.length-2] - '0';
        for(int i = arr.length - 2 ; i>=0;i--){
            if(arr[i] - '0' < arr[arr.length - 1] - '0'){
                return arr[i]-'0';
            }
        }
        // if(arr[arr.length-2] - '0' == arr[arr.length-1] - '0'){
        //     return -1;
        // }
        // for(int i=0;i<s.length();i++){
        //     se = arr[s.length() -  1];
        // }
            return -1;

    }
}