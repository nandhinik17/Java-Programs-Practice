import java.util.*;

class findMissingNuminArray {
    public static void main(String[] args) {
      int arr[] = {1,2,4,5};
      int first = Integer.MIN_VALUE;
      int second = Integer.MIN_VALUE;
      for(int num : arr){
          if(num >first){
              second = first;
              first=num;
          }
          if(num> second && num< first){
              second = num;
          }
      }
      System.out.println(second);
    }
}
