class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new TreeSet<Integer>();
        for(int i=0;i<nums.length; i++){
            set.add(nums[i]);
        }
        int k=0;
        for(int num : set){
        nums[k++] = num;
        }
        return set.size();
    }
}
