/*Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.
You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output
Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
Example 2:
Input: nums = [1,1,2]
Output: [1]
Example 3:
Input: nums = [1]
Output: []
 */

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer>  list = new ArrayList<Integer>();
        for(int n: nums){
            if(!map.containsKey(n)){
                map.put(n, 1);
            }
            else{
                map.put(n, map.get(n)+1);
            }
        }
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if(e.getValue()>=2){
             list.add(e.getKey());
            }
        }
        return list;
    }
}
