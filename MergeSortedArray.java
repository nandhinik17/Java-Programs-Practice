import java.util.*;


class MergeSortedArray {
    public static void main(String[] args) {
       int arr1[] = {1, 4, 7};
       int arr2[] = {2, 5, 8};
       Set<Integer> set = new TreeSet<Integer>();
       for(int num: arr1){
           set.add(num);
       }
       for(int num: arr2){
           set.add(num);
       }
       System.out.println(set);
    
}
}
