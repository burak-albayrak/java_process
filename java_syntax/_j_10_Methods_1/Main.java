public class Main {

    public static void main(String[] args){
        numberFinder();
        numberFinder();
        numberFinder();
    }
    public static void numberFinder(){
        int numbers[] = new int[]{1,2,4,6,7,9};
        int find = 6;
        boolean is_exist = false;

        for (int number : numbers){
            if(number == find){
                is_exist = true;
                break;
            }
        }
        if(is_exist){
            giveMessage(find);
        }else{
            System.out.println("Number is not exist: " + find);
        }
    }
    public static void giveMessage(int find){
        System.out.println("Number is exist: " + find);
    }
}
