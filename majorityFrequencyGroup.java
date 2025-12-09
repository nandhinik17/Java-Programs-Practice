class Solution {
    public String majorityFrequencyGroup(String s) {
        Map<Character, Integer> map = new TreeMap<Character, Integer>();

        for(char ch: s.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }
            else{
                map.put(ch, map.get(ch)+1);
            }
        }

        Map<Integer, List<Character>> map1 = new TreeMap<>();
       
        for(Map.Entry<Character, Integer> e: map.entrySet()){
            char ch = e.getKey();
            int val = e.getValue();
            if(!map1.containsKey(val)){
                map1.put(val, new ArrayList<>());
            }
            map1.get(val).add(ch);
        }
       System.out.println(map1);
       int maxSize = 0; 
       int maxFreq =0;
       List<Character> result = new ArrayList<>();
       for (Map.Entry<Integer, List<Character>> entry : map1.entrySet()) {
        int freq = entry.getKey();
        List<Character> chars = entry.getValue();
        if(chars.size()>maxSize || chars.size()==maxSize && freq>maxFreq){
            maxSize=chars.size();
            maxFreq = freq;
            result.clear();
           for (char ch : chars) {
            result.add(ch);
          }
        }

       }
       StringBuilder sb = new StringBuilder();
       for(char ch: result ){
             sb.append(ch);
       }
        return sb.toString();
    }
}
