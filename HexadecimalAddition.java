public class HexadecimalAddition {
    public static void main(String[] args) {
        String hex1 = "1A";
        String hex2 = "2F";

        String result = addHexNumbers(hex1, hex2);
        System.out.println("Sum of " + hex1 + " and " + hex2 + " is: " + result);
    }

    public static String addHexNumbers(String hex1, String hex2) {
        int decimal1 = hexToDecimal(hex1);
        int decimal2 = hexToDecimal(hex2);

        int decimalSum = decimal1 + decimal2;

        return decimalToHex(decimalSum);
    }

    public static int hexToDecimal(String hex) {
        int decimal = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            int value;
            if (hexChar >= '0' && hexChar <= '9') {
                value = hexChar - '0';
            } else if (hexChar >= 'A' && hexChar <= 'F') {
                value = hexChar - 'A' + 10;
            } else if (hexChar >= 'a' && hexChar <= 'f') {
                value = hexChar - 'a' + 10;
            }             decimal = decimal * 16 + value;
        }
        return decimal;
    }

    public static String decimalToHex(int decimal) {  s
        StringBuilder hex = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 16;
            char hexChar;
            if (remainder < 10) {
                hexChar = (char) ('0' + remainder);
            } else {
                hexChar = (char) ('A' + (remainder - 10));
            }
            hex.insert(0, hexChar);
            decimal /= 16;
        }
        return hex.length() > 0 ? hex.toString() : "0";     }
}
