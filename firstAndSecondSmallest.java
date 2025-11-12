/*Given an array, arr[] of integers, your task is to return the smallest and second smallest element in the array. If the smallest and second smallest do not exist, return -1.

Examples:

Input: arr[] = [2, 4, 3, 5, 6]
Output: [2, 3] 
Explanation: 2 and 3 are respectively the smallest and second smallest elements in the array.*/


class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(arr);
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int count=0;
      if(set.size()>1){
          for(int n: set){
              list.add(n);
              count++;
              if(count==2){
                  break;
              }
          }
      }
      else{
          list.add(-1);
      }
      return list;
        
    }
}
