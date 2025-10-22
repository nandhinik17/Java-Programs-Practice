/*Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].*/


class squaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int res[] = new int[nums.length];
        int val =0;
        for(int num: nums){
            res[val++]= num * num;
        }
        Arrays.sort(res);
        return res;
    }
}
