import java.util.Scanner;

public class Complementario1c {

    //Confeccionar un programa que dado un número entero como dato de entrada imprima la secuencia de números (incrementos de 1) de la siguiente forma:
    //1
    //1 2
    //1 2 3
    //1 2 3 4
    //1 2 3 4 5

    public static void main(String[] args) {

        int num1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num1 = scanner.nextInt();
        scanner.close();
        escalerita(num1);

    }

    public static void escalerita(int num1) {


        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
