class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for (int i = 0; i < apple.length; i++) {
            sum = sum + apple[i];
        }
        Arrays.sort(capacity);
        int count = 0;
        int total = 0;
        for (int i = capacity.length - 1; i >= 0; i--) {
            total = total + capacity[i];
            count++;
            if (total >= sum) {
                break;
            }
        }
        return count;
    }
}