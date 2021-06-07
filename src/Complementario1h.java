import java.util.Scanner;

public class Complementario1h {

    public static void main(String[] args) {

        String name, lastname, adress, city;
        int age;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = scan.nextLine();
        System.out.println("Enter your last name: ");
        lastname = scan.nextLine();
        System.out.println("Enter your age: ");
        age = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your adress: ");
        adress = scan.nextLine();
        System.out.println("Enter the name of city where you live: ");
        city = scan.nextLine();

        System.out.println(city + " - " + adress + " - " + age + " - " + name + " " + lastname);
    }
}
