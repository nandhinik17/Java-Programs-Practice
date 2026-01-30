/*You are given an array nums consisting of positive integers.

You have to take each integer in the array, reverse its digits, and add it to the end of the array. You should apply this operation to the original integers in nums.

Return the number of distinct integers in the final array.

 

Example 1:

Input: nums = [1,13,10,12,31]
Output: 6
Explanation: After including the reverse of each number, the resulting array is [1,13,10,12,31,1,31,1,21,13].
The reversed integers that were added to the end of the array are underlined. Note that for the integer 10, after reversing it, it becomes 01 which is just 1.
The number of distinct integers in this array is 6 (The numbers 1, 10, 12, 13, 21, and 31).
Example 2:

Input: nums = [2,2,2]
Output: 1
Explanation: After including the reverse of each number, the resulting array is [2,2,2,2,2,2].
The number of distinct integers in this array is 1 (The number 2).*/


class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int num: nums){
            set.add(num);
            set.add(reverseNum(num));
        }
        return set.size();
    }

    public int reverseNum(int n){
        int rev =0;
        while(n!=0){
            int digit = n %10;
            rev = rev*10+digit; 
            n=n/10;
        }
        return rev;
    }
}
