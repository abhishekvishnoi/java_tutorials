package core.pass.variable.to.method;

public class Main {

    public static void main(String[] args) {

        int localVar = 5;

        calculate(localVar);

        System.out.println(localVar);
    }

    public static void calculate(int calcVal){
        calcVal = calcVal *100;
    }
}
