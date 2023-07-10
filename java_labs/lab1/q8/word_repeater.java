import java.util.Scanner;

public class word_repeater {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        System.out.print("Enter an integer:");
        int integer = scanner.nextInt();
        scanner.nextLine();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < integer; i++) {
            result.append(word);
        }
        System.out.println(result);
    }
}
