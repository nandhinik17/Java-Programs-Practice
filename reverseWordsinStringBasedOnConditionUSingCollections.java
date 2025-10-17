import java.util.*;


class reverseWordsinStringBasedOnConditionUSingCollections {
  
  public static void main (String[] args) {
     String input = "I am Babu,currently attending,interview with,EPAM systems";
     //op-"Babu am I, attending currently,with interview,systems EPAM"
     
     String op[] = input.split(",");
     List<String> list = new ArrayList<>();
     
     for(String str: op){
       
       String words[] = str.split(" ");
       Collections.reverse(Arrays.asList(words));
       list.add(String.join(" ",words));
      // System.out.println(String.join(" ",words));
       
       
     }
     String result = String.join(",", list);
     System.out.println(result);
     
  }
}
