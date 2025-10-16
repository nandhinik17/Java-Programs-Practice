import java.util.*;

class removeElementsinArrayDiff {
  
  public static void main (String[] args) {
    
    int arr[] = {100, 100, 90, 90, 80, 80};
    
    int k=80;
   List<Integer> list = new ArrayList<>();
   for(int num: arr){
     list.add(num);
   }
   list.removeIf(n-> n==k);
   
   System.out.println(Arrays.toString(list.toArray(new Integer[0])));
}
}
