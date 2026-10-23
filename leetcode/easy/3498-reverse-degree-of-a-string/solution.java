class Solution {
    public int reverseDegree(String s) {
        char ch =0;
        int a =0;
        int index=0;
        int pro=0;
        int sum=0;
        // for(int i=0;i<s.length();i++){
        //     ch = s.charAt(i);
        //     a = 'z' - ch + 1;
        // }
        for(int i=0;i<s.length();i++){
            ch = s.charAt(i);
            a = 'z' - ch + 1;
            ch = s.charAt(i);
            index=i + 1;
            pro = index * a;
            sum += pro;
        }
        return sum;
    }
}