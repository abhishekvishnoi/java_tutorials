package core.pass.object.to.method;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setName("Abhishek");
        change(p1);
        System.out.println(p1.getName());
    }

    public static void change(Person p){
        p.setName("Arushi");
    }
}
