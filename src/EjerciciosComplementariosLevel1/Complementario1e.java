import java.util.Scanner;

public class Complementario1e {

    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1 = scan.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = scan.nextInt();
        scan.close();
        multiplicacionSucesiva(num1, num2);
    }

    public static void multiplicacionSucesiva(int num1, int num2) {
        int result = 0;
        for (int i = 0; i < num2; i++) {
            result += num1;
        }
        System.out.println("El resultado es: " + result);
    }
}
