class Solution{
public int minimumSize(int[] nums, int maxOperations) {
    int low = 1;
    int high = 0;

    for (int i = 0; i < nums.length; i++) {
        high = Math.max(high, nums[i]);
    }

    while (low <= high) {
        int mid = low + (high - low) / 2;

        long operations = 0;

        for (int i = 0; i < nums.length; i++) {
            operations += (nums[i] - 1) / mid;
        }

        if (operations <= maxOperations) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }

    return low;
}
}