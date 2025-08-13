/*Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

 

Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]*/




class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count = nums.length/3;
List<Integer> list = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int n: nums){

            if(map.containsKey(n)){
                map.put(n, map.get(n)+1);
            }
            else{
                map.put(n, 1);
            }
        }
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if(e.getValue()>count){
   list.add(e.getKey());
            }
        }
        return list;
    }
}
