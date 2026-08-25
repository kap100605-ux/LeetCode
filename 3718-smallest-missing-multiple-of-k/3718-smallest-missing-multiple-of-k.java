
class Solution {
    public int missingMultiple(int[] nums, int k) {
        int ans = k;

        while (true) {
            boolean found = false;

            for (int i=0;i<nums.length;i++) {
                int num = nums[i];
                if (num == ans) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return ans;
            }

            ans += k;
        }
    }
}
