import java.util.*;

class checkStringContainsWordFromArray {
    public static void main(String[] args) {
        String str = "I am a AUtomation Tester";
        String words[]= {"am", "Tester", "Manual"};
        for(String s: words){
            if(str.contains(s)){
                System.out.println("The mentioned word from an array "+ s + " was present in the given String");
            }
        }
    }
}
