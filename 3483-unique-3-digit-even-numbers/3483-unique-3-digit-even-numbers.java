class Solution {
    public int totalNumbers(int[] digits) {
        Arrays.sort(digits);

        int a = 0;
        int b = digits.length;

        for (int i = 0; i < b; i++) {

            
            if (digits[i] == 0) {
                continue;
            }

            
            if (i > 0 && digits[i] == digits[i - 1]) {
                continue;
            }

            for (int j = 0; j < b; j++) {

                
                if (j == i) {
                    continue;
                }

                
                if (j > 0 && digits[j] == digits[j - 1] && j - 1 != i) {
                    continue;
                }

                for (int k = 0; k < b; k++) {

                    
                    if (k == i || k == j) {
                        continue;
                    }

                    
                    if (digits[k] % 2 != 0) {
                        continue;
                    }

                
                    if (k > 0 && digits[k] == digits[k - 1]
                            && k - 1 != i && k - 1 != j) {
                        continue;
                    }

                    a++;
                }
            }
        }

        return a;
    }
}
