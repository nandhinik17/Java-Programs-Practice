import java.util.*;

class  longestCommonPrefix {
    public static void main(String[] args) {
     String str[]= {"flower", "flow", "flight"};
     String prefix = str[0];
     
     //System.out.println(prefix.indexOf(prefix));
     for(int i=1; i<str.length;i++){
         while(str[i].indexOf(prefix)!=0){
             prefix = prefix.substring(0, prefix.length()-1);
         }
     }
     
     System.out.println(prefix);
}
}

