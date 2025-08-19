/*Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

 

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true*/



class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
     
        StringBuilder sb = new StringBuilder(magazine);
       for(char ch: ransomNote.toCharArray()){
             if(sb.indexOf(String.valueOf(ch))==-1){
                return false;
             }
             int index = sb.indexOf(String.valueOf(ch));
             sb.deleteCharAt(index);
       }
       return true;
    }
}
