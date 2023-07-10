import java.util.Scanner;

public class Market {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int me = 70;
        int j = 19;
        int mi = 22;
        int a = 16;
        int c = 50;

        String meat = "meat";
        String juice = "juice";
        String milk = "milk";
        String apples = "apples";
        String chicken = "chicken";

        System.out.println("Enter your balance: ");
        int budget = scanner.nextInt();
        scanner.nextLine();

        if (budget < 16){
            System.out.println("No items available for your budget.");
            System.exit(0);
        }

        System.out.println("You can buy meat, juice, milk, apples or chicken. Which one do you choose?: ");
        String buy = scanner.nextLine();

        if (buy.equals(meat)) {
            if (budget >= 70) {
                budget = budget - me;
                System.out.println("Your new balance is " + budget + " Enjoy!");
            } else {
                System.out.println("Your budget is not enough!");
            }
        } else if (buy.equals(chicken)) {
            if (budget >= 50) {
                budget = budget - c;
                System.out.println("Your new balance is " + budget + " Enjoy!");
            } else {
                System.out.println("Your budget is not enough!");
            }
        } else if (buy.equals(milk)) {
            if (budget >= 22) {
                budget = budget - mi;
                System.out.println("Your new balance is " + budget + " Enjoy!");
            } else {
                System.out.println("Your budget is not enough!");
            }
        } else if (buy.equals(juice)) {
            if (budget >= 19) {
                budget = budget - j;
                System.out.println("Your new balance is " + budget + " Enjoy!");
            } else {
                System.out.println("Your budget is not enough!");
            }
        } else if (buy.equals(apples)) {
            if (budget >= 16) {
                budget = budget - a;
                System.out.println("Your new balance is " + budget + " Enjoy!");
            } else {
                System.out.println("Your budget is not enough!");
            }
        }

    }
}
