import java.util.*;
/* find the first non repeating character in java */
class Main {
    public static void main(String[] args) {
       String str = "aabbcdde";
       
       Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
       for(int i =0; i<str.length(); i++){
           if(map.containsKey(str.charAt(i))){
               map.put(str.charAt(i), map.get(str.charAt(i))+1);
           }
           else{
               map.put(str.charAt(i), 1);
           }
       }
       for(Map.Entry<Character, Integer> m: map.entrySet()){
          // System.out.println(m.getKey());
           if(m.getValue()==1){
               System.out.println(m.getKey());
               return;
           }
       }
       
    }
}
