
class Solution {
    public char repeatedCharacter(String s) {
        char res = 'a';

        for (int i = 0; i < s.length(); i++) {
            boolean repeat = false;

            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    repeat = true;
                    break;
                }
            }

            if (repeat) {
                res = s.charAt(i);
                break;
            }
        }

        return res;
    }
}
