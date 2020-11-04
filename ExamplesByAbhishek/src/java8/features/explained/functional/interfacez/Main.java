package java8.features.explained.functional.interfacez;

public class Main {

    public static void main(String[] args) {

        Square sq1 = (int x) -> x*x;
        Square sq2 = (int y) -> y*y - 20 ;

        System.out.println(sq1.calculateArea(10));
        System.out.println(sq2.calculateArea(10));

    }
}
