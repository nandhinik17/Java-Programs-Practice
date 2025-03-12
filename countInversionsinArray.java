import java.util.*;


class CountInversions {
    public static void main(String[] args) {
       int arr[] = {2, 4, 1, 3, 5};
       int k=0;
       for(int i=0;i<arr.length-1;i++){
           if(arr[i+1]>arr[i]){
               k++;
           }
       }
       
       System.out.println(k);
    
}
}
