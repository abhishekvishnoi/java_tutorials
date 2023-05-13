package core.generics;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List list = new LinkedList();
        // []

       // list.add(new Integer(1));
        list.add(new String("heelllo"));
        // [1 , "heelllo"]


        Object i = list.iterator().next();

            // type safety
        List<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(12);


    }
}
