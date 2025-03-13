import java.util.*;


//input-> aaabbcccc; op-> a3b2c4
class returnAlphabetsAndItsCountAsString {
    public static void main(String[] args) {
        String str = "aaabbcccc";
        char[] charArr = str.toCharArray();
        Map<Character, Integer> map = new TreeMap<Character, Integer>();
        for(char ch: charArr){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        String value = "";
        
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            value = value+ entry.getKey() + entry.getValue();
        }
        
        System.out.println(value);
        
    }
}

