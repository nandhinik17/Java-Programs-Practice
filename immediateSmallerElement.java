import java.util.*;
/*Input: arr[] = [4, 2, 1, 5, 3]
Output: [2, 1, -1, 3, -1]
Explanation: Array elements are 4, 2, 1, 5, 3. Next to 4 is 2 which is smaller, so we print 2. Next of 2 is 1 which is smaller,so we print 1. Next of 1 is 5 which is greater, so we print -1. Next of 5 is 3 which is smaller, so we print 3.  Note that for last element, output is always  going to be -1 because there is no element on right.*/

class immediateSmallerElement {
   static int  current=1;
    public static void findSmaller(int arr[]){
       int l=arr.length;
       for(int i=0;i<arr.length-1;i++){
           if(arr[i+1]<arr[i]){
               arr[i]=arr[i+1];
           }
           else{
               arr[i]=-1;
           }
       }
       arr[l-1]=-1;
       System.out.println(Arrays.toString(arr));
       
    }
    public static void main(String[] args) {
     findSmaller(new int[]{4, 2, 1, 5, 3});
      
    }
}
