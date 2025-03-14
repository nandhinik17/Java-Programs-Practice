import java.util.*;


class printOneToNWithoutLoop {
   static int  current=1;
    public static void printN(int N){
        if(current<=N){
              System.out.print(current++ + " ");
              printN(N);
        }
       
    }
    public static void main(String[] args) {
      printN(10);
      
    }
}
