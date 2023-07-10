import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string 1:");
        String string1 = scanner.nextLine();

        System.out.println("Enter string 2:");
        String string2 = scanner.nextLine();

        int result = string1.compareToIgnoreCase(string2);

        if(result == 0){

            System.out.println(string1+string2);
        }
        else if(result < 0) {

            System.out.println(string1 + "comes first");
        }
        else{

            System.out.println(string2 + "comes first");
        }
    }
}
