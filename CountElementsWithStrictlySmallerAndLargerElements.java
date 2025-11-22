/*Given an integer array nums, return the number of elements that have both a strictly smaller and a strictly greater element appear in nums.

 

Example 1:

Input: nums = [11,7,2,15]
Output: 2
Explanation: The element 7 has the element 2 strictly smaller than it and the element 11 strictly greater than it.
Element 11 has element 7 strictly smaller than it and element 15 strictly greater than it.
In total there are 2 elements having both a strictly smaller and a strictly greater element appear in nums.*/



class Solution {
    public int countElements(int[] nums) {
   //every elements need to be counted except minimum and maximum element
      Arrays.sort(nums);
     int min = nums[0];
     int max = nums[nums.length-1];
     int count =0;
      for(int i=0; i<nums.length; i++){
           if(nums[i]!=min && nums[i]!=max){
            count++;
           }
      }
return count;
    }
}
