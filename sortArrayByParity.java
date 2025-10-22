/*Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.

 

Example 1:

Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.*/

class sortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int res[] = new int[nums.length];
        for(int n: nums){
            list.add(n);
        }
        list.sort((a, b) -> {
            if(a%2==0 && b%2!=0)
            {
            return -1;
            }
           else if(a%2!=0 && b%2==0){
            return 1;
           }
           else{
            return a-b;
           }
        }
        );
        int val =0;
        for(int num: list){
            res[val++]=num;
        }

        return res;
    }
}
