/*You are given a string s consisting of lowercase English letters ('a' to 'z').

Your task is to:

Find the vowel (one of 'a', 'e', 'i', 'o', or 'u') with the maximum frequency.
Find the consonant (all other letters excluding vowels) with the maximum frequency.
Return the sum of the two frequencies.

Note: If multiple vowels or consonants have the same maximum frequency, you may choose any one of them. If there are no vowels or no consonants in the string, consider their frequency as 0.

The frequency of a letter x is the number of times it occurs in the string.
 

Example 1:

Input: s = "successes"

Output: 6

Explanation:

The vowels are: 'u' (frequency 1), 'e' (frequency 2). The maximum frequency is 2.
The consonants are: 's' (frequency 4), 'c' (frequency 2). The maximum frequency is 4.
The output is 2 + 4 = 6.
Example 2:*/


class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(char ch: s.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }
            else{
                map.put(ch, map.get(ch)+1);
            }
        }
       
        int vfreqMax=0;
        int cfreqMax=0;
        for(Map.Entry<Character, Integer> e: map.entrySet()){
            if(e.getKey()=='a'||e.getKey()=='e'||e.getKey()=='i'||e.getKey()=='o'||e.getKey()=='u'){
               if(e.getValue()>vfreqMax){
                vfreqMax = e.getValue();
               }
            }
            else{
                if(e.getValue()>cfreqMax){
                cfreqMax = e.getValue();
               }
            }
        }

        return vfreqMax+ cfreqMax;
    }
}
