/*Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]*/


class rotateArrayUsingCollections {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        if(nums.length!=1)
        {
        List<Integer> list = new ArrayList<Integer>();
        for(int n : nums){
        list.add(n);
        }
        Collections.reverse(list);
         System.out.println(list);
        Collections.reverse(list.subList(0, k));
         Collections.reverse(list.subList(k, list.size()));
        System.out.println(list);

        int val =0;
        for(int n1: nums){
            nums[val] = list.get(val);
            val++;
        }
    }
    }
}
