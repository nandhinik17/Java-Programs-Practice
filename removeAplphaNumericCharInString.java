import java.util.*;


class removeAplphaNumericCharInString {
  
  public static void main (String[] args) {
       String input = "He@#llo!123 Wo*rld$%^";
      System.out.println(input.replaceAll("[^a-zA-Z0-9]", ""));
  }
}
