import java.util.*;
class storeUniqueCharacterInString {
    public static void main(String[] args) {
        String str = "abcabcbb";
        Set<Character> set = new TreeSet<Character>();
        char ch[] = str.toCharArray();
        for(char c: ch){
            set.add(c);
        }
        System.out.println(set);
        
    }
}

