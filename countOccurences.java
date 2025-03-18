import java.util.*;
class countOccurences {
    
   public static int getCount (String S, int N)
    {
        int count =0;
       Map<Character, Integer> map = new HashMap<Character, Integer>();
       for(char ch: S.toCharArray()){
           if(map.containsKey(ch)){
               map.put(ch, map.get(ch)+1);
           }
           else{
               map.put(ch, 1);
           }
       }
       for(Map.Entry<Character, Integer> entry: map.entrySet()){
           if(entry.getValue()==N){
               count++;
           }
       }
       System.out.println(map);
       return count;
    }
    public static void main(String[] args) {
       
       System.out.println(getCount("geeksforgeeks",2));
    }
}
