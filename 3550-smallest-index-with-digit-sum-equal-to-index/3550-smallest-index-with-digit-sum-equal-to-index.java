
class Solution {
    public int smallestIndex(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int n = nums[i];
            int sum = 0;

            if (n == 0) {
                sum = 0;
            } else {
                while (n > 0) {
                    sum += n % 10;
                    n = n / 10;
                }
            }

            if (sum == i) {
                return i;
            }
        }

        return -1;
    }
}