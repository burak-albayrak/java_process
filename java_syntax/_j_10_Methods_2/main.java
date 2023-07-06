public class Main {
    public static void main(String[] args) {
        int number = add(5,7);
        System.out.println(number);
        String city = giveCity();
        System.out.println(city);
    }
    public static int add(int number1, int number2){
        return number1 + number2;
    }
    public static String giveCity(){
        return "ankara";
    }

}
