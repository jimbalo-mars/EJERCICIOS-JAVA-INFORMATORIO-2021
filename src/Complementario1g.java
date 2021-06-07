import java.util.Arrays;
import java.util.Scanner;

public class Complementario1g {

    //si funciona, funciona, por mas feo que este.

    public static void main(String[] args) {

        String stringToConvert;

        Scanner scanString = new Scanner(System.in);
        System.out.println("Introduce the string to convert: ");
        stringToConvert = scanString.nextLine();
        scanString.close();

        System.out.println("The string in lower case was: " + stringToConvert);
        System.out.println("The string converted to upper case is: " + stringConverter(stringToConvert));
    }

    public static String stringConverter(String stringToConvert) {
        char[] convertedToArr = stringToConvert.toCharArray();
        int size = convertedToArr.length;

        for (int i = 0; i != size; i++) {
            if (32 == convertedToArr[i]) {
                convertedToArr[i] = convertedToArr[i];
            } else {
                convertedToArr[i] = (char) (convertedToArr[i] - 32);
            }
        }
        String converted = String.valueOf(convertedToArr);
        return converted;
    }
}
