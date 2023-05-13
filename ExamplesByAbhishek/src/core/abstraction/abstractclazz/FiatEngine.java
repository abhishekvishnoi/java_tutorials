package core.abstraction.abstractclazz;

public class FiatEngine extends Engine{

    String type;

    public FiatEngine(String t) {
        this.type = t;
    }

    public void run() {
        System.out.println("i'm a " + type + " engine from FIAT , I'm running");
    }
}
