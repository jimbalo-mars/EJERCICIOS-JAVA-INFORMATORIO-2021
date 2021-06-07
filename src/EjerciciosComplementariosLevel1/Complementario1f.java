import java.util.Scanner;

public class Complementario1f {

    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        num1 = scan.nextInt();
        System.out.print("Ingrese el exponente: ");
        num2 = scan.nextInt();
        scan.close();
        System.out.println("El resultado de la potencia es: " + potenciar(num1, num2));

    }

    public static int potenciar(int num1, int num2) {
        int result = 1;
        for (int i = 1; i <= num2; i++) {
            result *= num1;
        }
        return result;
    }
}
