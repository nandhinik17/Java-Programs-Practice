import java.util.*;


/*
Input: arr[] = ["Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks"]
Output: "GeeksforGeeks"
Explanation: name "GeeksforGeeks" has maximum length among all names. 

*/
class displayLongestNameinStringList {
    public static String displayName(List<String> list){
        int l=0;
        String str="";
        for(String s: list){
          if(s.length()>l){
              l=s.length();
              str=s;
          }
        }
        
        return str;
    }
    public static void main(String[] args) {
       System.out.println(displayName(Arrays.asList("Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks")));
      
    }
}
