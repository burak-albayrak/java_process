import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double pi = 3.14;

        System.out.print("Please enter the radius: ");
        double radius = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Please enter the height: ");
        double height = scanner.nextDouble();
        scanner.nextLine();

        double volume = (pi * height * radius * radius) / 3;

        System.out.println("The volume of the cone is " + volume);
    }
}
