import java.util.Scanner;
import java.util.Random;

public class letter_guesser_pro {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        char randomChar = (char) (random.nextInt(26) + 'a');

        System.out.println("Welcome to letter finder game.");
        char guess;
        boolean found = false;

        do{
            System.out.print("Guess the letter: ");
            guess = scanner.nextLine().charAt(0);
            if(randomChar != guess) {
                System.out.println("You are wrong!! try again.");
            }else{
                found = true;
            }
        }while(!found);
        System.out.println("Well Done!!!");
    }
}
