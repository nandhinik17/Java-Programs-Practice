import java.util.*;

class randowmNumGeneration {
    public static void main(String[] args) {
       Random r = new Random();
       int a = r.nextInt(101);
       System.out.println(a);
       
       //Another Way using Math
       int a1 = (int)(Math.random()*101);
        System.out.println(a1);
    }
}
