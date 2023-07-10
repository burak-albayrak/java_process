import java.util.Scanner;

public class letter_finder {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int i = 0;
        char letter;
        System.out.println("I have guessed a letter in the English alphabet.");

        do{
            i++;
            System.out.print("Guess the letter: ");
            letter = scanner.next().charAt(0);
            System.out.println("Go forward in the alphabet");
        }while(letter != 't');

        System.out.printf("t is correct! You guessed correctly after %d tries!", i);
    }
}
