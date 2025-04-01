import java.util.*;

class CountElementsLessThanGivenNuminList {
     public static int countOfElements(int x, List<Integer> arr) {
        int count =0;
      
        for( int i=0;i<arr.size(); i++){
            if(arr.get(i)<=x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
       //List<Integer> list = List.of(10, 1, 2, 8, 4, 5);
        System.out.println(countOfElements(9, List.of(10, 1, 2, 8, 4, 5)));
    }
}
