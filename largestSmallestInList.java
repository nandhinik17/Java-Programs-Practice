import java.util.*;

class largestSmallestInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(34, 12, 56, 8, 89, 1, 67);
        int max = Collections.max(list);
        System.out.println(max);
        int min = Collections.min(list);
        System.out.println(min);
        
    }
}
