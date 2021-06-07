import java.util.Scanner;

public class Complementario1d {

    public static void main(String[] args) {

        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        num = scan.nextInt();
        System.out.println(factorial(num));
    }

    private static int factorial(int num) {
        int result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
