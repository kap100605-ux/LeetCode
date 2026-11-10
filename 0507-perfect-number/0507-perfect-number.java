
class Solution {
    public boolean checkPerfectNumber(int num) {
        int t =0;
        for(int i =1;i<num;i++){
            if(num%i==0){
                t+=i;
            }
        }
        if(t==num){
            return true;
        }
        return false;
        
    }
}