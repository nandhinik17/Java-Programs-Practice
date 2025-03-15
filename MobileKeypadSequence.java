import java.util.*;

/*Convert a sentence into its equivalent mobile numeric keypadsequence; Given a sentence in the form of a string in uppercase, convert it into its equivalent mobile numeric keypad sequence. Please note there might be spaces in between the words in a sentence and we can print spaces by pressing 0.

Example 1:

Input:
S = "GFG"
Output: 43334
Explanation: For 'G' press '4' one time.
For 'F' press '3' three times.
Example 2:

Input:
S = "HEY U"
Output: 4433999088
Explanation: For 'H' press '4' two times.
For 'E' press '3' two times. For 'Y' press '9' 
three times. For white space press '0' one time.
For 'U' press '8' two times*/

public class MobileKeypadSequence {
    
    public static String mobileSeq(String s){
                
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char ch = 'A';
        int number = 2; // Starts from 'A' which corresponds to 2
       while(ch<='Z'){
           map.put(ch, number);
           // System.out.println(ch + " " + number);
            int value = number;
             ch++;
             if(ch!='W' && ch!='X' && ch!='Y' && ch!='Z' && ch!='P' && ch!='Q' && ch!='R' && ch!='S')
             {
       for(int i=1;i<3;i++){
            value=(value*10)+number;
           map.put(ch, value);
             ch++;
       }
       number++;
             }
             else{
                 for(int i=1;i<=3;i++){
            value=(value*10)+number;
           map.put(ch, value);
             ch++;
       }
       number++;
             }
      
       }
       map.put(' ', 0);
       String str ="";
       for(char ch1: s.toCharArray()){
           str = str+ map.get(ch1);
       }
       return str;
    }
    public static void main(String[] args) {
    System.out.println(mobileSeq("WTXNP"));
      System.out.println(mobileSeq("HEY U"));
       
      
    }
    
    
}
