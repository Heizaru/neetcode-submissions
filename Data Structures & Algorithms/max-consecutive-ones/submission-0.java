class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int max = 0;
        for (int num : nums) {
            if (num == 1) {
                counter++;
            } else {
                counter = 0;
            }
            max = Math.max(max, counter);
        }
        return max;
    }
}