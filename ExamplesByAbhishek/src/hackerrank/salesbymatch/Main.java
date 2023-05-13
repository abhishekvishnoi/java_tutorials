package hackerrank.salesbymatch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {


    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        HashMap <Integer , Integer> map = new HashMap<>();


        for (int i = 0; i < ar.size(); i++) {
            int count = 1;

            if(! map.containsKey(ar.get(i))){
                for (int j = i +1 ; j < ar.size() ; j++) {
                    if(ar.get(i) == ar.get(j)){
                        count ++;
                    }
                }
                map.put(ar.get(i), count / 2 );
            }
        }

        int sum = 0;
        for ( Integer key : map.keySet()) {
            sum = sum + map.get(key);
        }
        
        return sum ;
    }


    public static void main(String[] args) {


        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(1);
        integers.add(2);
        integers.add(1);
        integers.add(3);
        integers.add(2);

        System.out.println(sockMerchant( 1 , integers));
    }
}
