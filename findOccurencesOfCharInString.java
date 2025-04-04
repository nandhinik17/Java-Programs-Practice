import java.util.*;

class findOccurencesOfCharInString {
    public static void main(String[] args) {
      String str = "AutomationTesting";
      Map<Character, Integer> map = new HashMap<Character, Integer>();
      for(char ch : str.toCharArray()){
          if(map.containsKey(ch)){
              map.put(ch, map.get(ch)+1);
          }
          else{
              map.put(ch, 1);
          }
      }
      System.out.println(map);
      
      //to Traverse Map
      for(Map.Entry<Character, Integer> e : map.entrySet()){
          System.out.println(e.getKey() + " "+ e.getValue());
      }
    }
}
