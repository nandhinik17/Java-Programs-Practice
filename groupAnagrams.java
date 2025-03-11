import java.util.*;
class Anagrams {
    
    public static void main(String[] args){
       String str[]= {"eat", "tea", "tan", "ate", "nat", "bat"};
      
       HashMap<String, List<String>> map = new LinkedHashMap<String, List<String>>();
       for(int i=0; i<str.length; i++){
           String prefixValue = str[i];
           char ch[] = prefixValue.toCharArray();
           Arrays.sort(ch);
          List<String> list = new LinkedList<String>();
           for(int j=0; j<str.length; j++){
               char ch1[] = str[j].toCharArray();
               Arrays.sort(ch1);
               if(Arrays.equals(ch, ch1)){
                     list.add(new String(str[j]));
                    
               }
       }
       map.put(prefixValue, list);
     
    }
      System.out.println(map);
    
    }
}
