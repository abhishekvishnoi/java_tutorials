package hackerrank.minimumdistances;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static int minimumDistances(List<Integer> a) {
        // Write your code here

        Integer min_diff = Integer.MAX_VALUE;

        for (int i = 0; i < a.size(); i++) {
            for (int j = i + 1; j < a.size(); j++) {

                if(a.get(i) == a.get(j)){
                    int temp = j - i;
                      if(temp < min_diff ){
                          min_diff = temp;
                      }
                }
            }
        }

            if (min_diff == Integer.MAX_VALUE) {
                return -1;
            } else {
                return min_diff;
            }

        }


    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();

       /* integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(10);*/
       // integers.add(7);

        integers.add(7);
        integers.add(1);
        integers.add(3);
        integers.add(4);
        integers.add(1);
        integers.add(7);
       // integers.add(4);
       // integers.add(7);
        System.out.println(minimumDistances(integers));


    }


}
