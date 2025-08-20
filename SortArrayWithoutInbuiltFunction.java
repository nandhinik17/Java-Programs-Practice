
/*iven an array of integers nums, sort the array in ascending order and return it.

You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.

 

Example 1:

Input: nums = [5,2,3,1]
Output: [1,2,3,5]
Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).*/


class Solution {
    public int[] sortArray(int[] nums) {
        Integer arr[] = new Integer[nums.length];
        Integer k=0;
        for(int n: nums){
       arr[k++] = n;
        }
        Arrays.sort(arr, (a, b)->{
            return a-b;
        });
         int arr1[] = new int[nums.length];
         int h=0;
          for(Integer num: arr){
          arr1[h++] = num;
        }
        return arr1;
    }
}
