package core.abstraction.abstractclazz;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(new FiatEngine("Petrol"));

        car.start();
    }
}
