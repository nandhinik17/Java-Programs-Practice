import java.util.*;


class stringManipulation {
  
  public static void main (String[] args) {
     String str= "abcdefg";
     //op - cde
     if(str.length()<3 || str.length()%2==0){
       
       System.out.println(str);
       return;
     }
     
     int mid = str.length()/2;
     
    System.out.println(str.substring(mid-1, mid+2));
  }
}
