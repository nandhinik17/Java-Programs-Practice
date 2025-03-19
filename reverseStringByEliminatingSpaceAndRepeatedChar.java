import java.util.*;
/*Given a string, say S, print it in reverse manner eliminating the repeated characters and spaces.

Example 1:

Input: S = "GEEKS FOR GEEKS"
Output: "SKEGROF"*/
class reverseStringByEliminatingSpaceAndRepeatedChar {
     public static String reverseString(String s)
    {
        String str = s.replaceAll("\\s+", "");
       StringBuilder sb = new StringBuilder(str);
       String str1 = sb.reverse().toString();
        Set<Character> set = new LinkedHashSet<Character>();
        for(char ch: str1.toCharArray()){
            set.add(ch);
        }
        
       String op ="";
       Iterator<Character> it = set.iterator();
       while(it.hasNext()){
           char ch = it.next();
           op = op+ ch;
       }
       return op;
    }
    public static void main(String[] args) {
       
            System.out.println(reverseString("GEEKS FOR GEEKS"));
    }
}
