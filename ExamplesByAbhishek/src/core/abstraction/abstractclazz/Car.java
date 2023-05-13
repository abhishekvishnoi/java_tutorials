package core.abstraction.abstractclazz;

public class Car {

    Engine engine;

    Car(Engine engine){
        this.engine = engine;
    }

    public void start(){

        System.out.println("Car is starting");
        engine.run();
        engine.greet();
    }

 }
