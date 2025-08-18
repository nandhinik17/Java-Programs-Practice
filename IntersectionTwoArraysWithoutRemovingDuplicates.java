/*Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]*/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      Map<Integer, Integer> map = new HashMap<Integer, Integer>();
      List<Integer> list = new ArrayList<Integer>();
      for(int x: nums1){
        if(map.containsKey(x)){
            map.put(x, map.get(x)+1);
        }
        else{
            map.put(x, 1);
        }
      }
      for(int n: nums2){
         if(map.containsKey(n) && map.get(n)>0){
            list.add(n);
            map.put(n, map.get(n)-1);
         }
      }  
      int result[] = new int[list.size()];
      int i=0;
      for(int number: list){
    result[i++]= number;
      }
      return result;
    }
}
