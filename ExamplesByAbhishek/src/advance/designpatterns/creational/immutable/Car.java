package advance.designpatterns.creational.immutable;

public class Car {

    final String name;

    public Car (String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
