import java.util.*;


//input-> aaabbcccc; op-> a3b2c4
class reverseEachWordInString {
    public static void main(String[] args) {
        String str = "I am a Automation Tester";
        String str1[] = str.split("\\s+");
        String value = "";
        for(String s: str1){
            if(s.length()>1){
                StringBuilder sb = new StringBuilder(s);
                value = value + sb.reverse().toString();
            }
            else{
                value = value+s;
            }
            value= value + " ";
        }
        System.out.println(value);
        
    }
}

