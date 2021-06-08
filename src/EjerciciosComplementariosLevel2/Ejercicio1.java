package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        String city;
        int option = 1;
        int position = 0;
        ArrayList<String> cities = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        while (option == 1){
            System.out.println("Add a new city to favourites: ");
            city = scanner.nextLine();
            cities.add(city);

            System.out.println("Press 1 to keep adding or any other number to stop it.");
            option = scanner.nextInt();
            scanner.nextLine();
        }

        for ( String i : cities){
            position++;
            System.out.println("#"+position + " " + i);
        }
        scanner.close();
    }
}
