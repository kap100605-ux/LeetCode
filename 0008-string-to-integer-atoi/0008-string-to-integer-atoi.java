
class Solution {
    public int myAtoi(String s) {

        int c = 0;
        int sign = 1;
        int i = 0;

        
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        
        if (i < s.length() && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } 
        else if (i < s.length() && s.charAt(i) == '+') {
            sign = 1;
            i++;
        }

    
        while (i < s.length() && 
               s.charAt(i) >= '0' && 
               s.charAt(i) <= '9') {

            int digit = s.charAt(i) - '0';
            if (c > (Integer.MAX_VALUE - digit) / 10) {
                if (sign == 1) {
                return Integer.MAX_VALUE;
    }       else {
                    return Integer.MIN_VALUE;
    }
}

            c = c * 10 + digit;

            i++;
        }

        
        return c * sign;
    }
}