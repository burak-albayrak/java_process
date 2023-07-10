import java.util.Scanner;

public class grade_calculator {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int s = 0;

        System.out.println("Enter your grade: ");
        int grade = scanner.nextInt();
        scanner.nextLine();

        if (100 < grade || grade < 0){
            System.out.println("Enter between 0-100 pls");
            System.exit(0);
        }


        if(100 >= grade && grade >= 90){
            s = 1;
        }else if(89 >= grade && grade >= 80){
            s = 2;
        }else if(79 >= grade && grade >= 70){
            s = 3;
        }else if(69 >= grade && grade >= 60){
            s = 4;
        }else if(59 >= grade && grade >= 0){
            s = 5;
        }

        switch (s){
            case 1:
                System.out.println("Your letter grade is: AA");
                break;
            case 2:
                System.out.println("Your letter grade is: BB");
                break;
            case 3:
                System.out.println("Your letter grade is: CC");
                break;
            case 4:
                System.out.println("Your letter grade is: DD");
                break;
            case 5:
                System.out.println("Your letter grade is: FF");
                break;
        }

    }
}
