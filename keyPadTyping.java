import java.util.*;
/*You are given a n length string S of lowercase alphabet characters and the task is to find its matching decimal representation as on the shown keypad. Output the decimal representation corresponding to the string. For ex: if you are given amazon then its corresponding decimal representation will be 262966.
Input:
S = geeksforgeeks
Output: 4335736743357
Explanation:geeksforgeeks is 4335736743357
Input:
S = geeksquiz
Output: 433577849 */
class keyPadTyping {
    public static String getNumVal(String str){
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        char ch ='a';
        int val = 2;
        while(ch<='z'){
          
            int loopVal;
            if(ch!='p' && ch!='q' && ch!='r' && ch!='s' && ch!='w' && ch!='x' && ch!='y' && ch!='z'){
          loopVal = 3;
     }
     else{
          loopVal = 4;
     }
     for(int i=1;i<=loopVal; i++){
         map.put(ch, val);
         ch++;
     }
     val++;
        }
         String op= "";
      for(char ch1: str.toCharArray()){
     op = op+ map.get(ch1);
     }
     System.out.println(map);
     return op;
    }
    
    
    public static void main(String[] args) {
        System.out.println(getNumVal("ph"));
        System.out.println(getNumVal("geeksforgeeks"));
        System.out.println(getNumVal("geeksquiz"));
       
    }
}
