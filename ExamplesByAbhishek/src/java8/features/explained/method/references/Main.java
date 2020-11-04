package java8.features.explained.method.references;

public class Main {

    public static void main(String[] args) {

        Square sq = Main :: calculateSquareArea;

        int sqArea = sq.calculate(10);
        System.out.println("area : " + sqArea);

        Square rec = Main :: calculaterectangleArea;

        int recArea = rec.calculate(10);
        System.out.println("area : " + recArea);

    }


    public static int calculateSquareArea(int a){
        System.out.println("Hello, this is a square method.");
        return a*a;
    }

    public static int calculaterectangleArea(int a ){
        System.out.println("Hello, this is a square method.");
        return a*a + 20;
    }

}
