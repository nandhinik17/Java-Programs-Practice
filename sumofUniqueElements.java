/*You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.

 

Example 1:

Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.*/



class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int n: nums){
            if(map.containsKey(n)){
                map.put(n , map.get(n)+1);
            }
            else{
                map.put(n, 1);
            }
        }
        int sum=0;
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
         if(e.getValue()==1){
            sum= sum+ e.getKey();
         }
        }
        return sum;
    }
}
