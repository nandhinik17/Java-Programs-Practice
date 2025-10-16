import java.util.*;

class ReverseWordsAndConvertFirstLetterToCaps {
  
  public static void main (String[] args) {
    
    String str = "this is epam systems";
    String arr[] = str.split(" ");
    String res = "";
    
    for(int i=arr.length-1; i>=0; i--){
      String val = Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1);
    
      res = res + val + " ";
     
    }
   
    System.out.println(res);
}
}
