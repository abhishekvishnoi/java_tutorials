package hackerrank.beautifultriplets;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static int beautifulTriplets(int d, List<Integer> arr) {
        // Write your code here

       int  count = 0;

        for (int i = 0; i < arr.size() ; i++) {
            for (int j = i +1 ; j < arr.size(); j++) {
                if((arr.get(j)-arr.get(i)) == d) {
                    for (int k = j + 1; k < arr.size(); k++) {
                        if((arr.get(k)-arr.get(j)) == d)
                        {
                            count ++;
                        }
                    }
                }
            }
        }
        return  count ;
    }

    public static void main(String[] args) {


        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        System.out.println(beautifulTriplets( 1 , integers));
    }
}
