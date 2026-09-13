
class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {

        char letter1 = coordinate1.charAt(0);
        char number1 = coordinate1.charAt(1);

        boolean white1 = false;

        if ((letter1 == 'a' || letter1 == 'c' || letter1 == 'e' || letter1 == 'g') &&
            (number1 == '2' || number1 == '4' || number1 == '6' || number1 == '8')) {
            white1 = true;
        }

        if ((letter1 == 'b' || letter1 == 'd' || letter1 == 'f' || letter1 == 'h') &&
            (number1 == '1' || number1 == '3' || number1 == '5' || number1 == '7')) {
            white1 = true;
        }

        char letter2 = coordinate2.charAt(0);
        char number2 = coordinate2.charAt(1);

        boolean white2 = false;

        if ((letter2 == 'a' || letter2 == 'c' || letter2 == 'e' || letter2 == 'g') &&
            (number2 == '2' || number2 == '4' || number2 == '6' || number2 == '8')) {
            white2 = true;
        }

        if ((letter2 == 'b' || letter2 == 'd' || letter2 == 'f' || letter2 == 'h') &&
            (number2 == '1' || number2 == '3' || number2 == '5' || number2 == '7')) {
            white2 = true;
        }

        return white1 == white2;
    }
}
