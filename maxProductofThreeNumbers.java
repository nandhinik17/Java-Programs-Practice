*/
Example 1:

Input: nums = [1,2,3]
Output: 6
Example 2:

Input: nums = [1,2,3,4]
Output: 24
Example 3:

Input: nums = [-1,-2,-3]
Output: -6 */

class maxProductofThreeNumbers {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        return Math.max(nums[l-1] * nums[l-2]* nums[l-3], nums[0]*nums[1]*nums[l-1]);
    }
}
