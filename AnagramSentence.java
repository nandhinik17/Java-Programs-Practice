import java.util.*;
/* check if the sentence is anagram or not removing the white space*/
class Main {
    public static void main(String[] args) {
        String str ="A man a plan a canal Panama";
        String str1 = str.replaceAll("\\s+", "").toLowerCase();
        int start = 0;
        int end = str1.length()-1;
        boolean flag=true;
        while(start<end){
            if(str1.charAt(start)!=str1.charAt(end))
            {
            flag = false;
            break;
            }
        start++;
        end--;
        }
        
      System.out.println(flag);  
    }
    
}
