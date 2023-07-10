import math.*; // for all classes
// import math.SimpleCalculates; for specific class

public class Main {
    public static void main(String[] args) {
        SimpleCalculates simpleCalculates = new SimpleCalculates();
        Square square = new Square();

        System.out.println(square.sq(2));
        System.out.println(simpleCalculates.Add(2,5));
    }
}
