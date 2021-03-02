package core.escaping.references;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        MyClass m1 = new MyClass();
        HashMap<String , String> myMap = new HashMap<>();
        myMap.put("1" , "Abhishek");
        myMap.put("2" , "Arushi");

        changeNameOnly(myMap);
        System.out.println(myMap.get("2"));

    }

    public static void changeNameOnly(HashMap<String , String> myMap){

        myMap.remove("2");


    }



}
