import java.util.*;
/*Given two strings s1 and s2. Return true if the string s2 can be obtained by rotating (in any direction) string s1 by exactly 2 places, otherwise, false. */
class stringRotationByTwoplacesAnyDirections {
    
   public static boolean isRotated(String s1, String s2) {
        char str[] = s1.toCharArray();
        int index =2;
        while(index>0)
        {
        for(int i=0;i<str.length-1; i++){
            char temp = str[i];
            str[i]=str[i+1];
            str[i+1]=temp;
        }
        index--;
        }
         System.out.println(str);
        char str1[] = s1.toCharArray();
        int index1 =2;
        while(index1>0)
        {
        for(int i=str1.length-1; i>0; i--){
            char temp1 = str1[i];
            str1[i]=str1[i-1];
            str1[i-1]=temp1;
        }
        index1--;
        }
        System.out.println(str1);
        if((new String(str1).equals(s2)) || (new String(str).equals(s2))){
            return true;
        }
       
       return false;
    }
    public static void main(String[] args) {
       
       System.out.println(isRotated("daxjheq","eqdaxjh"));
    }
}
