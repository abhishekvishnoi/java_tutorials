package advance.designpatterns.creational.singleton;

public class MySingleton {

    private volatile static MySingleton mySingleton;

    public static MySingleton getMySingleton(){

        if(mySingleton == null) {
            synchronized (MySingleton.class) {
                if(mySingleton==null){
                    mySingleton = new MySingleton();
                    System.out.println("No object is available , providing the new object");
                }else{
                    System.out.println("an object is available in other thread , providing the same object");
                }
            }
        }else{
            System.out.println("an object is available , providing the same object");
        }

        return mySingleton;

    }


    public void printHello(){
        System.out.println("Object Says Hello");
    }

}
