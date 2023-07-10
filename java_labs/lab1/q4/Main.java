import java.util.Scanner;

public class Main {

    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the date in dd.mm.yyyy format: ");
    String date = scanner.nextLine();

    String day = date.substring(0, 2);
    String month = date.substring(3, 5);
    String year = date.substring(6);

    String convertedDate = month + "/" + day + "/" + year;

    System.out.println("The date you entered is: " + convertedDate);

    }
}
