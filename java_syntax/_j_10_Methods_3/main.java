public class Main {
    public static void main(String[] args) {
        int result = add(2,3,4,6,7,9);
        System.out.println(result);

    }
    public static int add(int... numbers){
        int result = 0;
        for(int number : numbers){
            result += number;
        }
        return result;
    }
}
