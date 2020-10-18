package advance.designpatterns.creational.singleton;

public class MySingleton {

    private static MySingleton obj;

    MySingleton(){}

    public static MySingleton getSingletonObj(){

        if(obj == null)
        {

            synchronized (MySingleton.class)
            {
                if(obj==null){
                    obj = new MySingleton();
                    System.out.println("create new object ..");
                }else {
                    System.out.println("return old object");
                }
            }
        }else{
            System.out.println("return old object");
        }
        return obj;
    }

    public void printHello(){
        System.out.print("Object Says Hello");
    }

}
