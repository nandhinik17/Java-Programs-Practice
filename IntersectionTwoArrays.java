/*Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]*/


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
         Set<Integer> set1 = new HashSet<Integer>();
         List<Integer> list = new ArrayList<Integer>();
       
        int i=0;
        for(int num: nums1){
            set.add(num);
        }
         for(int num1: nums2){
            set1.add(num1);
        }
       for(int n: set1){
        if(set.contains(n))
        list.add(n);
        }
 int result[] = new int[list.size()];
for(int h: list){
    result[i++]=h;
}
              return result;  
       }

    }
