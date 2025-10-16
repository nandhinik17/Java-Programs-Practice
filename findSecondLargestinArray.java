import java.util.*;

class findSecondLargestinArray {
  
  public static void main (String[] args) {
    
    int arr[] = {100, 100, 90, 90, 80};
    
    int first = Integer.MIN_VALUE;
    int second = Integer.MIN_VALUE;
    
    if(arr.length<2){
      System.out.println("Array muts have 2....");
    }
    for(int num: arr){
      if(num>first){
        second=first;
        first=num;
      }
      else if(num<first && num >second){
        second = num;
      }
    }
    
    System.out.println(second);
  }
}
