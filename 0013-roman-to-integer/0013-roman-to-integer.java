
class Solution {
    public int romanToInt(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'I') {
                if (i + 1 < s.length() && 
                    (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                    count -= 1;
                } else {
                    count += 1;
                }
            }

            if (s.charAt(i) == 'V') {
                count += 5;
            }

            if (s.charAt(i) == 'X') {
                if (i + 1 < s.length() && 
                    (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                    count -= 10;
                } else {
                    count += 10;
                }
            }

            if (s.charAt(i) == 'L') {
                count += 50;
            }

            if (s.charAt(i) == 'C') {
                if (i + 1 < s.length() && 
                    (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                    count -= 100;
                } else {
                    count += 100;
                }
            }

            if (s.charAt(i) == 'D') {
                count += 500;
            }

            if (s.charAt(i) == 'M') {
                count += 1000;
            }
        }

        return count;
    }
}
