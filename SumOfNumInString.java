import java.util.*;
import java.util.regex.*;
class SumOfNumInString {
    public static int SumOfNum(String s) {
       String s1 = "";
       StringBuilder sb = new StringBuilder(s1);
       int sum=0;
       for(char ch: s.toCharArray()){
           if(Character.isDigit(ch)){
               sb.append(ch);
           }
           if(Character.isLetter(ch)){
               if(sb.length()>0){
               sum = sum+ Integer.parseInt(sb.toString());
               sb = new StringBuilder(s1);
               }
           }
       }
      
               if(sb.length()>0){
               sum = sum+ Integer.parseInt(sb.toString());
               }
               
       return sum;
       
        
    }


  
/*Sum of numbers in string
Difficulty: BasicAccuracy: 63.01%Submissions: 61K+Points: 1Average Time: 30m
Given a string str containing alphanumeric characters. The task is to calculate the sum of all the numbers present in the string.

Examples:

Input: s = "1abc23"
Output: 24
Explanation: 1 and 23 are numbers in the string which is added to get the sum as 24.
Input: s = "geeks4geeks"
Output: 4
Explanation: 4 is the only number, so the sum is 4.*/
    public static void main(String[] args) {
       System.out.println(SumOfNum("1Test123"));
       System.out.println(SumOfNum("geeks4geeks"));
    }
}
