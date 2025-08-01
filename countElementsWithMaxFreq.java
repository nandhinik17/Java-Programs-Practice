/*You are given an array nums consisting of positive integers.

Return the total frequencies of elements in nums such that those elements all have the maximum frequency.

The frequency of an element is the number of occurrences of that element in the array.

 

Example 1:

Input: nums = [1,2,2,3,1,4]
Output: 4
Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
So the number of elements in the array with maximum frequency is 4.*/


class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int n : nums){
            if(map.containsKey(n)){
                map.put(n, map.get(n)+1);
            }
            else{
                map.put(n, 1);
            }
        }
        int max=0;


        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>max){
                max= entry.getValue();
            }
        }
    int count=0;
        for(int number: nums){
            if(map.get(number)==max){
                count++;
            }
        }

        return count;
    }
}
