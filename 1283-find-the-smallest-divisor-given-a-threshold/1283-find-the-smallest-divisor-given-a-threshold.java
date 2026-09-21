

class Solution {
    public long sumD(int[] nums, int div ){
        long sum=0;
        long  n = nums.length;
        for(int i =0;i<n;i++){
            sum = sum +(nums[i]+div - 1)/div;

        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low =1;
        int high = Integer.MAX_VALUE;
        int ans =-1;
        while(low<=high ){
            int mid = low+(high-low) /2;


            if(sumD(nums,mid)<= threshold){
                ans = mid;
                high = mid-1;
            }

            else{
                low= mid+1;
            }
        }
        return ans;
    }
}
