class Solution {
    public int stud(int[]nums,int m ){
        
        int stu=1;
        int pg=0;

        for(int i =0;i<nums.length;i++){
            if(pg+nums[i]<= m){
                pg+=nums[i];
            }
            else{
                stu++;
                pg= nums[i];
            }
            
        }

       return stu; 
 
    }
    public int splitArray(int[] nums, int k) {
        int low= 0;

        int high =0;

        for(int i=0;i<nums.length;i++){
            high +=nums[i];
            
            low= Math.max(low,nums[i]);
        }

        while(low<=high){
            int mid = low+(high -low)/2;
            int noS= stud(nums,mid);
            if(noS>k) 
            {
                low= mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return low;
    }
}