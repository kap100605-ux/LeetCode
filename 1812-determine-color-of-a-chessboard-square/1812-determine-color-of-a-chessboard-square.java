
class Solution {
    public boolean squareIsWhite(String coordinates) {
        char letter = coordinates.charAt(0);
        char number = coordinates.charAt(1);

        if ((letter == 'a' || letter == 'c' || letter == 'e' || letter == 'g') &&
            (number == '2' || number == '4' || number == '6' || number == '8')) {
            return true;
        }

        if ((letter == 'b' || letter == 'd' || letter == 'f' || letter == 'h') &&
            (number == '1' || number == '3' || number == '5' || number == '7')) {
            return true;
        }

        return false;
    }
}
