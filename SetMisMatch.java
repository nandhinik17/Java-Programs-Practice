/*You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

 

Example 1:

Input: nums = [1,2,2,4]
Output: [2,3]
Example 2:

Input: nums = [1,1]
Output: [1,2]*/

class Solution {
    public int[] findErrorNums(int[] nums) {
        int result[] = new int[2];
        int i=0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num: nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }
        }

        int l = nums.length;
      
        int duplicate=-1;
        int missNumber =-1;
        for(int j=1; j<=l;j++){
            if(map.containsKey(j)){
            if(map.get(j)==2){
             duplicate= j;
            }
            }
           else{
                missNumber=j;
            }
        }
        return new int[]{duplicate, missNumber};
    }
}
