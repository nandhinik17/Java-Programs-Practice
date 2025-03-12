import java.util.*;

class KFrequentElements {
    public static void main(String[] args) {
       int[] nums ={1,1,1,2,2,3};
       int k = 2;
       int op[] = new int[k];
       Map<Integer, Integer> map = new HashMap<Integer, Integer>();
       for(int num: nums){
           if(map.containsKey(num)){a
               map.put(num, map.get(num)+1);
           }
           else{
               map.put(num, 1);
           }
       }
       int index=0;
       for(Map.Entry<Integer, Integer> entry: map.entrySet()){
           if(entry.getValue()>1){
               op[index]=entry.getKey();
               index++;
           }
       }
       for(int n: op){
           System.out.println(n);
       }
       
        
    
}
}

