
import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : score) {
            list.add(num);
        }

        Collections.sort(list, Collections.reverseOrder());

        String[] result = new String[score.length];

        for (int i = 0; i < list.size(); i++) {
            int currentScore = list.get(i);

            int originalIndex = 0;
            for (int j = 0; j < score.length; j++) {
                if (score[j] == currentScore) {
                    originalIndex = j;
                    break;
                }
            }

            if (i == 0) {
                result[originalIndex] = "Gold Medal";
            } else if (i == 1) {
                result[originalIndex] = "Silver Medal";
            } else if (i == 2) {
                result[originalIndex] = "Bronze Medal";
            } else {
                result[originalIndex] = String.valueOf(i + 1);
            }
        }

        return result;
    }
}
