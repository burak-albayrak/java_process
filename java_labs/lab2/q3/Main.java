import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;

        while (true) {
            System.out.println("Enter an integer: ");
            String number = scanner.nextLine();

            if (number.equals("x")) {
                break;
            }

            int num = Integer.parseInt(number);
            min = Math.min(min, num);
            max = Math.max(max, num);
            sum += num;
            count++;
        }

        System.out.println(min);
        System.out.println(max);

        double result = Math.pow(Math.sin(max), min);

        System.out.println("Result: " + result);
    }
}
