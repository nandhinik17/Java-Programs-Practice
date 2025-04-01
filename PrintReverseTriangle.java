import java.util.*;

class PrintReverseTriangle {
     public static void printTriangle(int n) {
        for(int i=n;i>=1;i--){
            for(int j=i;j<n;j++){
                System.out.print(" ");
                
            }
            for(int k=1; k<=i*2-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       printTriangle(5);
       
    }
}
