import java.util.*;

/*Offer is used to add the num to Priority Queue, poll will removes the minimum element, if the Queue size is greater than k removes the element, which means, the queue will have only k number of elements,   */
class findKthLargestNuminArray {
    public static void main(String[] args) {
       int[] nums = {12, 3, 5, 7, 19};
       int k = 2;
       PriorityQueue<Integer> p = new PriorityQueue<Integer>();
       for(int num: nums){
           p.offer(num);
           
           if(p.size()>k){
               p.poll();
           }
       }
        System.out.println(p.peek());
    
}
}

