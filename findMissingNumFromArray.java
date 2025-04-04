import java.util.*;

class findMissingNumFromArray {
    public static void main(String[] args) {
      int arr[] = {1,2,4,5};
      int sum =0;
      for(int num: arr){
          sum = sum+num;
      }
      int l = arr.length+1;
      int val = (l*(l+1))/2;
      System.out.println(sum);
      System.out.println(val);
      System.out.println("Missing Number ****** " + (val-sum) );
    }
}
