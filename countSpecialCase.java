/*You are given a string word. A letter is called special if it appears both in lowercase and uppercase in word.

Return the number of special letters in word.

 

Example 1:

Input: word = "aaAbcBC"

Output: 3

Explanation:

The special characters in word are 'a', 'b', and 'c'.*/

class Solution {
    public int numberOfSpecialChars(String word) {
     Set<Character> upperCase = new HashSet<Character>();
    Set<Character>  lowerCase = new HashSet<Character>(); 


    for(char ch: word.toCharArray()){
        if(Character.isUpperCase(ch)){
            upperCase.add(ch);
        }
        else{
            lowerCase.add(ch);
        }
    }


    int count =0;

    for(char ch: upperCase){
      if(lowerCase.contains(Character.toLowerCase(ch))){
          count++;
      }
    }

    return count;
    }
}
