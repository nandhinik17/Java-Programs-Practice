import java.util.*;

class fibonacciSeries {
    public static void main(String[] args) {
       int first =0;
       int second =1;
        System.out.println(first);
           System.out.println(second);
       for(int i=2;i<10;i++){
          
           int val = first+ second;
           System.out.println(val);
           first= second;
           second= val;
       }
       
    }
}
