
class Solution {
    public boolean sumGame(String num) {

        int n = num.length();
        int mid = n / 2;

        int sum1 = 0;
        int sum2 = 0;

        int question1 = 0;
        int question2 = 0;

        
        for (int i = 0; i < mid; i++) {
            if (num.charAt(i) == '?') {
                question1++;
            } else {
                sum1 += num.charAt(i) - '0';
            }
        }

        
        for (int i = mid; i < n; i++) {
            if (num.charAt(i) == '?') {
                question2++;
            } else {
                sum2 += num.charAt(i) - '0';
            }
        }

        
        if ((question1 + question2) % 2 != 0) {
            return true;
        }

        
        int difference = sum1 - sum2;

        
        int questionDifference = question1 - question2;

        
        return difference != -(questionDifference / 2) * 9;
    }
}