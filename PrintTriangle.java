import java.util.*;

class PrintTriangle {
     public static void printTriangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       printTriangle(5);
       
    }
}
