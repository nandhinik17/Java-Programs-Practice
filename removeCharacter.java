public class removeCharacter {
    
    /*Given two strings string1 and string2, remove those characters from first string(string1) which are present in second string(string2). Both the strings are different and contain only lowercase characters.
NOTE: Size of  first string is always greater than the size of  second string( |string1| > |string2|).
Example 1:
Input:
string1 = "computer"
string2 = "cat"
Output: "ompuer"
Explanation: After removing characters(c, a, t)
from string1 we get "ompuer".*/
  
    public static void main(String[] args) {
        String string1 = "computer";
        String string2 = "cat";
        for (char ch : string2.toCharArray()) {
            string1 = string1.replace(ch, ' ');
        }
       string1 = string1.replace(" ","");
        System.out.println(string1);  
    }
}
