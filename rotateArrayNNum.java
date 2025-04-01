// Online Java Compiler
import java.util.*;
class rotateArrayNNum {
   static void leftRotate(int arr[], int d) {
        if(d>arr.length){
            d= d%arr.length;
        }
        int temp;
        while(d>0){
            for(int i=0;i<arr.length-1;i++){
                temp = arr[i];
               arr[i]= arr[i+1];
               arr[i+1] = temp;
            }
            d--;
        }
        System.out.print(Arrays.toString(arr));
    }
    public static void main(String[] args) {
       leftRotate(new int[]{-1, -2, -3, 4, 5, 6, 7}, 2);
    }
}
