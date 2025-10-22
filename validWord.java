/*A word is considered valid if:

It contains a minimum of 3 characters.
It contains only digits (0-9), and English letters (uppercase and lowercase).
It includes at least one vowel.
It includes at least one consonant.
You are given a string word.

Return true if word is valid, otherwise, return false.

Notes:

'a', 'e', 'i', 'o', 'u', and their uppercases are vowels.
A consonant is an English letter that is not a vowel.
 

Example 1:

Input: word = "234Adas"

Output: true

Explanation:

This word satisfies the conditions.

Example 2:

Input: word = "b3"

Output: false

Explanation:

The length of this word is fewer than 3, and does not have a vowel.*/

class validWord {
    public boolean isValid(String word) {
        int vCount =0;
        int conCount=0;
        if(word.length()<3){
            return false;
        }
        for(char ch: word.toCharArray()){
            if(Character.isLetter(ch)){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' || ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vCount++;
            }
            else{
                conCount++;
            }

            }
            if(!Character.isDigit(ch) && !Character.isLetter(ch)){
             return false;
            }
        }

        if(vCount>0 && conCount>0){
            return true;
        }
    return false;

    }
}
