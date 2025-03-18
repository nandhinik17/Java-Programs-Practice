import java.util.*;
class stringRotationByTwoplaces {
    
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

        return new String(str).equals(s2);
    }
    public static void main(String[] args) {
       
       System.out.println(isRotated("amazon","azonam"));
    }
}
