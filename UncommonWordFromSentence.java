
/*A sentence is a string of single-space separated words where each word consists only of lowercase letters.

A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.

Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.

 

Example 1:

Input: s1 = "this apple is sweet", s2 = "this apple is sour"

Output: ["sweet","sour"]

Explanation:

The word "sweet" appears only in s1, while the word "sour" appears only in s2.*/


class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map1 = new HashMap<String, Integer>();
         Map<String, Integer> map2 = new HashMap<String, Integer>();
      List<String> list = new LinkedList<String>();
         for(String s: s1.split("\\s+")){
            if(map1.containsKey(s)){
                map1.put(s, map1.get(s)+1);
            }
            else{
                map1.put(s, 1);
            }
         }
         for(String x: s2.split("\\s+")){
            if(map2.containsKey(x)){
                map2.put(x, map2.get(x)+1);
            }
            else{
                map2.put(x, 1);
            }
         }

         for(String str: s1.split("\\s+")){
            if(map1.get(str)==1 && !map2.containsKey(str)){
                list.add(str);
            }
         }
         for(String str1: s2.split("\\s+")){
            if(map2.get(str1)==1 && !map1.containsKey(str1)){
                list.add(str1);
            }
         }

         String[] stringArray = list.toArray(new String[0]);
         return stringArray;
    }
}
