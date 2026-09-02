class Solution {
    public boolean uniformArray(int[] nums1) {
        int[] nums2= new int[nums1.length];
        for(int i =0;i<nums1.length;i++){
            
            if(nums1[i]-nums2[i]%2!=0){
                return true;
            }
        }
        return false;
    }
}