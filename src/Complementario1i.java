import java.util.Locale;
import java.util.Scanner;

public class Complementario1i {

    public static void main(String[] args) {
        String word;
        char letter;


        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter the text to be processed");
        word = scanObj.nextLine().toLowerCase();
        System.out.println("Now enter the letter to count: ");
        letter = scanObj.nextLine().toLowerCase().charAt(0);

        System.out.println("La cantidad de letras "+ letter + " encontradas es: " + finder(word, letter));

    }

    public static int finder(String word, char letter){
        int count = 0;
          for ( int i = 0; i < word.length(); i++ ){
              if (word.charAt(i) == letter){
                  count++;
              }
          }
        return count;
    }
}

