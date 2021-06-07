import java.util.Scanner;

public class Complementario1b {

    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero:");
        num2 = scanner.nextInt();
        scanner.close();

        System.out.println("La suma es: " + suma(num1, num2));
        System.out.println("La resta es: " + resta(num1, num2));
        System.out.println("La multiplicacion es: " + multiplicacion(num1, num2));
        System.out.println("La division es: " + division(num1, num2));
        System.out.println("El resto es: " + resto(num1, num2));

    }

    public static int suma(int num1, int num2) {
        return num1 + num2;
    }

    public static int resta(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int resto(int num1, int num2) {
        return num1 % num2;
    }


}
