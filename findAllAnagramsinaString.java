/*Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

 

Example 1:

Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".*/


class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       int l = p.length();
      char pArr[] = p.toCharArray();
      Arrays.sort(pArr);
      String sorted = new String(pArr);
       List<Integer> list = new ArrayList<Integer>();
       for(int i=0; i<=s.length()-l ; i++){
        String str = s.substring(i, i+l);
        char sArr[] = str.toCharArray();
        Arrays.sort(sArr);
        String sortedString = new String(sArr);
        if(sorted.equals(sortedString)){
            list.add(i);
        }
       }

       return list;
    }
}
