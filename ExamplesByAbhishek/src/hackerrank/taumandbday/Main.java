package hackerrank.taumandbday;

import javax.swing.event.MouseInputAdapter;

public class Main {


    public static long taumBday(int b, int w, int bc, int wc, int z) {

       Long total_bc = 0l ;
       Long  total_wc = 0l;


       if(bc > wc){

           if( bc > wc + z ) {
               total_wc = Long.valueOf(w) * Long.valueOf(wc);
               total_bc = Long.valueOf(b) * Long.valueOf(wc + z);
           }else{
               total_bc = Long.valueOf(b) * Long.valueOf(bc);
               total_wc  = Long.valueOf(w) * (wc);
           }


       }else if (bc < wc){

           if (wc > bc + z){
               total_wc = Long.valueOf(w) * Long.valueOf(bc + z);
               total_bc = Long.valueOf(b) * Long.valueOf(bc);
           }else{
               total_bc =Long.valueOf(b) * Long.valueOf(bc);
               total_wc  = Long.valueOf(w) * (wc);
           }


       }else if (bc == wc){
           total_bc = Long.valueOf(b) * Long.valueOf(bc);
           total_wc  = Long.valueOf(w) * Long.valueOf(wc);
       }

        return total_bc + total_wc;
    }



    public static void main(String[] args) {


        System.out.println(taumBday(27984 ,1402 ,619246,615589,247954));


       // System.out.println(taumBday(3 ,6 ,9,1,1));
       // System.out.println(taumBday(7 ,7 ,4,2,1));
       // System.out.println(taumBday(3 ,3 ,1,9,2));

    }
}
