import java.util.*;
/* Check whether the array contains the duplicate element or not */
class Main {
    public static void main(String[] args) {
       int[] arr = {1, 2, 3, 4, 5, 6, 2}; 
       Set<Integer> set = new HashSet<Integer>();
       for(int num: arr){
           if(set.contains(num)){
               System.out.println("Duplicate Found....");
               return;
           }
           else{
               set.add(num);
           }
       }
       
       System.out.println("No Duplicates....");
    }
}
