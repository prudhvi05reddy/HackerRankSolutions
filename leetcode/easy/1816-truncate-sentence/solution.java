class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        String result = "";
        for(int i=0; i< k; i++){
            result += words[i] + " " ;
        }
        return result.trim();
    }
}