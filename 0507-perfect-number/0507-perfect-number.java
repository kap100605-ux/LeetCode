class Solution {
    public boolean checkPerfectNumber(int num) {
        int a =0;
        for(int i =1;i<num;i++){
            if(num%i==0){
                a+=i;
            }
        }
        if(a==num){
            return true;
        }
        return false;
        
    }
}