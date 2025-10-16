import java.util.*;

class removeElementsinArray {
  
  public static void main (String[] args) {
    
    int arr[] = {100, 100, 90, 90, 80, 80};
    
    int k=80;
   List<Integer> list = new ArrayList<Integer>();
   list.removeIf(n-> n==k);
   
   System.out.println(Arrays.toString());
}
