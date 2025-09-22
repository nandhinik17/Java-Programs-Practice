/*Given two string arrays words1 and words2, return the number of strings that appear exactly once in each of the two arrays.

 

Example 1:

Input: words1 = ["leetcode","is","amazing","as","is"], words2 = ["amazing","leetcode","is"]
Output: 2
Explanation:
- "leetcode" appears exactly once in each of the two arrays. We count this string.
- "amazing" appears exactly once in each of the two arrays. We count this string.
- "is" appears in each of the two arrays, but there are 2 occurrences of it in words1. We do not count this string.
- "as" appears once in words1, but does not appear in words2. We do not count this string.
Thus, there are 2 strings that appear exactly once in each of the two arrays.*/


class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for(String s: words1){
            if(!map.containsKey(s)){
            map.put(s, 1);
            }
            else{
                map.put(s, map.get(s)+1);
            }
        }

        Map<String, Integer> map1 = new HashMap<String, Integer>();

        for(String s: words2){
            if(!map1.containsKey(s)){
            map1.put(s, 1);
            }
            else{
                map1.put(s, map1.get(s)+1);
            }
        }
int count=0;
      for (String s1 : map.keySet()) {
        if(map1.containsKey(s1)){
            if(map.get(s1)==1 && map1.get(s1)==1){
                count++;
            }
        }
        }
return count;
    }
}
