class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
           int count=0;
        for(int i=0;i< words.length;i++){
            if(words[i].indexOf(x)!= -1){
                count++;
            }
        }
            List<Integer> arr = new ArrayList<>();
            for(int i=0;i<words.length;i++){
                if(words[i].indexOf(x) != -1){
                    arr.add(i);
                }
            }
            return arr;
    }
    }