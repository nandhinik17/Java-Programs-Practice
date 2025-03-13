import java.util.*;
class returnSecondCharFromLastinEachWordOfString {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       String str1[] = str.split("\\s+");
       for(int i=0; i<str1.length; i++){
           if(str1[i].length()>1){
               StringBuilder sb = new StringBuilder(str1[i]);
               String s =sb.reverse().toString();
               System.out.println(s.charAt(1));
           }
       }
    }
}

