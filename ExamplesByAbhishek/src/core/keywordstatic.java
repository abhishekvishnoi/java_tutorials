package core;

public class keywordstatic {

   private static Integer a=10;

   private Integer b = 20;

   /*static{
       a =10;
   }*/

    public static void main(String[] args) {

        staticupdate();

        keywordstatic kys = new keywordstatic();
        kys.update();

    }

    public void update(){
        a = a + 40;
        b = b + 15;
        System.out.println(a);
        System.out.println(b);
    }

    public static void staticupdate(){
        a = a + 10;
       // this.b = b + 25; // 'core.keywordstatic.this' cannot be referenced from a static context
        System.out.println(a);

    }

}
