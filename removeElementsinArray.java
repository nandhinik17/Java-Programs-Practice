import java.util.*;

class removeElementsinArray {
  
  public static void main (String[] args) {
    
    int arr[] = {100, 100, 90, 90, 80};
    
    int k=80;
   List<Integer> list = new ArrayList<Integer>();
  
  for(int num: arr){
    if(num!=k){
      list.add(num);
    }
  }
  
  System.out.println(Arrays.toString(list.toArray(new Integer[0])));
  }  
}
