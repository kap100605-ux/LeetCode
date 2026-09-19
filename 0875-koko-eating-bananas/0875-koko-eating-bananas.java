class Solution {
    public long totalH( int[] piles, int h ){
        long totalHr=0;
        
        for(int i =0;i<piles.length;i++){
            
           totalHr +=(piles[i] +(long) h - 1) / h;


        }
        return totalHr;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low =1;

        int max = Integer.MIN_VALUE;

        for (int num : piles) {
        max = Math.max(max, num);
        }

        int high = max;
        int ans =Integer.MAX_VALUE;


        while(low<= high){
            int mid = low+(high - low)/2;
            long  totalH= totalH(piles,mid);
            if(totalH<=h){
                ans = mid;
                high = mid-1;
            }
            else {
                low= mid+1;

            }

        }
        return ans;
        
    }
}