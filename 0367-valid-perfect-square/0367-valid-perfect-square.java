class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;
        for(int i =0;i<num;i++){
            if(num==(long) i*i){
                return true;

            }
        }
        return false;
    }
}

