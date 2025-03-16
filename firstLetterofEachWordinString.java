import java.util.*;
public class firstLetterofEachWordinString {
/*Print first letter of every word in the string
Given a string S, the task is to create a string with the first letter of every word in the string.
Example 1:
Input: 
S = "geeks for geeks"
Output: gfg */


   public static String firstLetter(String s){
       String str[] = s.split("\\s+");
       String op= "";
       for(String s1: str){
           op = op+ s1.charAt(0);
       }
       return op;
   }

    public static void main(String[] args) {
        System.out.println(firstLetter("geeks for geeks"));
        System.out.println(firstLetter("i love programming"));
        
    }
}
