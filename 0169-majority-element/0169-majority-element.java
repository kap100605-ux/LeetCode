class Solution {
    public int majorityElement(int[] nums) {
        int m = 0;
        int t = 0;

        for (int i = 0; i < nums.length; i++) {

            if (m==0) {
                t=nums[i];
            } 
             if (nums[i] == t) {
                m++;
            } else {
                m--;
            }

        }

        return t;

    }
}