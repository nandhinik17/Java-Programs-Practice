import java.util.*;


class reverseWordsBasedonCondition {
  
  public static void main (String[] args) {
     String input = "I am Babu,currently attending,interview with,EPAM systems";
     //op-"Babu am I, attending currently,with interview,systems EPAM"
     
     String op[] = input.split(",");
     String res = "";
     
     for(int j=0; j<op.length; j++){
       
       String str[] = op[j].split(" ");
       
       for(int i=str.length-1; i>=0; i--){
         
         res = res + str[i];
         if(i!=0){
           res = res+ " ";
         }
         
       }
       if(j!=op.length-1){
       res = res + ",";
       }
       
       
     }
     
     System.out.println(res);
  }
}
