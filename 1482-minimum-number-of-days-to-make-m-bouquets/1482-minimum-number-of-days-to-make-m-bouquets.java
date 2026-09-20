
class Solution {
    public boolean possible(int[] bloomDay, int day, int m, int k) {
        int cnt = 0;
        int nofB = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                cnt++;
            } else {
                nofB += cnt / k;
                cnt = 0;
            }
        }

        // Process the final consecutive group
        nofB += cnt / k;

        return nofB >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        long val = (long) m * k;

        if (val > bloomDay.length) {
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (possible(bloomDay, mid, m, k)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
