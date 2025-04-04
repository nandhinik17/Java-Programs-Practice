import java.util.*;

class secondLargestNuminArray {
    public static void main(String[] args) {
      int arr[] = {1,5,2,3,7,8,9,10,0,3};
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
