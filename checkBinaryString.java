import java.util.*;

class checkBinaryString {
    public static boolean checkBinary(String str){
        for(char ch: str.toCharArray()){
            if(ch!='0' && ch!='1'){
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
       System.out.println(checkBinary("11100000"));
       System.out.println(checkBinary("75"));
    }
}
