/*Example 1:

Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation: 
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1). 
For nums[3]=2 there exist one smaller number than it (1). 
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).*/


class numberSmallerThanCurrentNum {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        //1 2 2 3 8
        int dup[] = new int[nums.length];
        int k=0;
        for(int num: nums){
            dup[k++]=num;
        }
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i]))
          map.put(nums[i], i);
        }

        int res[] = new int[nums.length];
        for(int j=0; j<nums.length; j++)
        {
            res[j]=map.get(dup[j]);
        }
        return res;
    }
}
