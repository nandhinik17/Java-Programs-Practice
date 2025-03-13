import java.util.*;

class rotateAnArrayForNtimes {
    public static int[] rotate(int[] arr, int N ){
        if(arr.length>N){
            N= N%arr.length;
        }
        while(N>0){
            for(int i=0;i<arr.length-1;i++){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            N--;
        }
        return arr;
    }
    
    
    
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        System.out.println(Arrays.toString(rotate(arr1, 7)));
        
    }
}

