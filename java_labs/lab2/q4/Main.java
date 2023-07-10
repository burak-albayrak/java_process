// Test several methods for manipulating String objects
// ***************************************************************
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        String phrase = new String ("This is a String test.");
        int phraseLength; // number of characters in the phrase String
        int middleIndex; // index of the middle character in the String
        String firstHalf; // first half of the phrase String
        String secondHalf; // second half of the phrase String
        String switchedPhrase; //a new phrase with original halves switched
// compute the length and middle index of the phrase
        phraseLength = phrase.length();
        middleIndex = phraseLength / 2;
// get the substring for each half of the phrase
        firstHalf = phrase.substring(0,middleIndex);
        secondHalf = phrase.substring(middleIndex, phraseLength);
// concatenate the firstHalf at the end of the secondHalf
        switchedPhrase = secondHalf.concat(firstHalf);
// print information about the phrase
        System.out.println();
        System.out.println ("Original phrase: " + phrase);
        System.out.println ("Length of the phrase: " + phraseLength +
                " characters");
        System.out.println ("Index of the middle: " + middleIndex);
        System.out.println ("Character at the middle index: " +
                phrase.charAt(middleIndex));
        System.out.println ("Switched phrase: " + switchedPhrase);
        System.out.println();

        //First question

        int leftIndex = middleIndex - 1;
        int rightIndex = middleIndex + 1;
        String middle3 = phrase.substring(leftIndex, rightIndex + 1);
        System.out.println(middle3);

        //Second question

        switchedPhrase = switchedPhrase.replace(' ', '*');
        System.out.println(switchedPhrase);

        //third question

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a city:");
        String city = scanner.nextLine();
        System.out.println("Please enter a state:");
        String state = scanner.nextLine();
        String upperState = state.toUpperCase();
        String lowerCity = city.toLowerCase();
        String result = upperState + lowerCity + upperState;
        System.out.println(result);
    }
}
