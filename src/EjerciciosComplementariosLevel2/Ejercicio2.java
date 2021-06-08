package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

    public static int num, initialSize = 0, finalSize = 0;
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Integer> numbers = new ArrayList<Integer>();

    public static void main(String[] args) {
        listInitializer();
        initialSize = numbers.size();
        System.out.println("The original size of the list is: " + initialSize);
        listIterator();
        listEdgesModifier();
        finalSize = numbers.size();
        System.out.println("The modified size of the list is: "+ finalSize);
        listIterator();
    }

    public static ArrayList<Integer> listInitializer() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Please add a new number: ");
            num = scanner.nextInt();
            numbers.add(num);
        }
        return numbers;
    }

    public static ArrayList<Integer> listIterator(){
        System.out.println("Actual members of the list: ");
        for (int i : numbers){
            System.out.println(i);
        }
        return numbers;
    }

    public static void listEdgesModifier(){
        System.out.println("Add the new First number: ");
        num = scanner.nextInt();
        numbers.add(0,num);
        System.out.println("Add the new Last number");
        num = scanner.nextInt();
        numbers.add(6,num);
    }
}