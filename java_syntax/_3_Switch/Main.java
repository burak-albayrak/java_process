public class Main {

    public static void main(String[] args){
        char grade = 'k';

        switch (grade){
            case'A':
            case'a':
                System.out.println("Well Done!!");
                break;
            case'B':
            case'b':
                System.out.println("Bravo!!!!");
                break;
            case'C':
            case'c':
                System.out.println("It's OK..");
                break;
            case'D':
            case'd':
                System.out.println("Mehh :(");
                break;
            case'F':
            case'f':
                System.out.println("Try again.. :((");
                break;
            default:
                System.out.println("Wrong input!!");
        }
    }
}
