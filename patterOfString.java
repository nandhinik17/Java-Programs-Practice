import java.util.*;
// Given a string s. Find the pattern of the strings in the examples below.

// Examples :

// Input: s = "GeeK"
// Output: Geek
//         Gee
//         Ge
//         G
// Explanation: Decrease one character after each line
class patterOfString {
    public static ArrayList<String> pattern(String s) {
      ArrayList<String> list = new ArrayList<String>();
     
     int l = s.length();
      while(l>0){
          list.add(s.substring(0,l));
          l--;
          
      }
      return list;
    }
    public static void main(String[] args) {
        for(String s1: pattern("Nandhini")){
            System.out.println(s1);
        }
    }
}
