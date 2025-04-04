import java.util.*;

class swapTwoNumWithoutThirdVar {
    public static void main(String[] args) {
      int a = 40;
      int b =30;
      a= a+b; //a =70; b=30
      b = a-b; //a=70; b=40
      a=a-b; //a=30; b=40;
      System.out.println(a);
       System.out.println(b);
    }
}
