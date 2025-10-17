import java.util.*;


class removeAlphaNumericUsingCHaracterClass {
  
  public static void main (String[] args) {
       String input = "He@#llo!123 Wo*rld$%^";
      //System.out.println(input.replaceAll("[^a-zA-Z0-9]", ""));
      String str = "";
      for(char ch: input.toCharArray()){
        
        if(Character.isLetter(ch) || Character.isDigit(ch)){
          str = str + Character.toString(ch);
        }
      }
      System.out.println(str);
  }
}
