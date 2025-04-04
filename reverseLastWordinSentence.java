import java.util.*;

class reverseLastWordinSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String words[] = s.split(" ");
        StringBuilder sb = new StringBuilder(words[words.length-1]);
        words[words.length-1] = sb.reverse().toString();
        String str = String.join(" ", words);
        System.out.println(str);
        
        System.out.println("Another way of Reverseing the String---------");
        //other ways to join the String
        String output= "";
        for(int i=0;i<words.length; i++){
            output= output+ words[i];
            output = output+ " ";
        }
         System.out.println(output);
    }
}
