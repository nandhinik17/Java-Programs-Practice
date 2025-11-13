/*You are given a string s consisting of lowercase english letters. Your task is to count how many distinct characters appear an even number of times in the string.

Examples:

Input: s = "abacaba"
Output: 2
Explanation: The frequency of a is 4, b is 2 and c is 1 so there are 2 characters with even frequency.*/



class Solution {
    public int count(String s) {
       int count=0;
       Map<Character, Integer> map = new HashMap<Character, Integer>();
       for(char ch: s.toCharArray()){
           if(!map.containsKey(ch)){
               map.put(ch, 1);
           }
           else{
               map.put(ch, map.get(ch)+1);
           }
       }
       for(Map.Entry<Character, Integer> e: map.entrySet()){
           if(e.getValue()%2==0){
               count++;
           }
       }
        return count;
    }
}
