class Solution {
    public boolean isPerfectSquare(int num) {
        long ans =0;
        if(num==1) return true;
        for(int i =1;i<num;i++){
            if(num==(long) i * i){
                return true;
            }
            
        }
        return false;
    }
}