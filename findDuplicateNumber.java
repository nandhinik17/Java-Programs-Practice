class findDuplicateNumber {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num: nums){
            if(!map.containsKey(num)){
                map.put(num, 1);
            }
            else{
                map.put(num, map.get(num)+1);
            }
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue()>1){
                return e.getKey();
            }
        }
        return -1;
    }
}
