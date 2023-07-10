import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string of operations:");
        String operations = scanner.nextLine();

        if (!operations.matches("[+\\-*/]+")){

            System.out.println("Invalid string");
            return;
        }

        System.out.println("Enter an integer:");
        int number = scanner.nextInt();

        if (String.valueOf(number).length() < operations.length() + 1 ){

            System.out.println("The length of integer is inappropriate");
            return;
        }
        if (String.valueOf(number).length() > operations.length() + 1 ){

            System.out.println("The length of string of operations is inappropriate");
            return;
        }

        double result = Character.getNumericValue(String.valueOf(number).charAt(0));

        for (int i = 0; i < operations.length(); i++){
            char operation = operations.charAt(i);
            int sum = Character.getNumericValue(String.valueOf(number).charAt(i + 1));

            switch (operation){

                case '+':
                    result += sum;
                    break;
                case '-':
                    result -= sum;
                    break;
                case '*':
                    result *= sum;
                    break;
                case '/':
                    result /= sum;
                    break;
            }
        }
        System.out.println("Result: " + result);
    }
}
