import java.util.*;

class elementCount {
    public static void main(String[] args) {
        String str[] ={"apple", "banana", "apple", "orange", "banana", "banana"};
        Map<String, Integer> map = new TreeMap<String, Integer>();
        for(String s: str){
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }
            else{
                map.put(s, 1);
            }
        }
        
        System.out.println(map);
        
    }
}
