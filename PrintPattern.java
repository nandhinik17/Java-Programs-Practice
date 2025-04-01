import java.util.*;

class PrintPattern {
     public static void printPattern(int n) {
        for (int i=1;i<=N;i++)
     {
         for(int j=1;j<=i;j++)
         {
           System.out.print("*");
         }
         System.out.print(" ");
        }
    }
    
    public static void main(String[] args) {
       printPattern(5);
       
    }
}
