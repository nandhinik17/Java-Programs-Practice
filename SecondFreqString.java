import java.util.*;
class SecondFreqString {
 public static String secFrequent(String arr[])
    {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String s: arr){
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }
            else{
                map.put(s, 1);
            }
        }
        
        int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for(int freq: map.values()){
            if(freq>firstMax){
                secondMax= firstMax;
                firstMax= freq;
            }
            if(freq>secondMax && freq<firstMax){
                secondMax= freq;
            }
        }
        for(Map.Entry<String, Integer> e : map.entrySet()){
            if(e.getValue()==secondMax){
                return e.getKey();
            }
        }

        return "";
    }
    public static void main(String[] args) {
        String arr[] = {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"};
        System.out.println(secFrequent(arr));
    }
}

/*Second most repeated string in a sequence
Given a sequence of strings, the task is to find out the second most repeated (or frequent) string in the given sequence.

Note: No two strings are the second most repeated, there will be always a single string.

Example 1:

Input:
N = 6
arr[] = {aaa, bbb, ccc, bbb, aaa, aaa}
Output: bbb
Explanation: "bbb" is the second most 
occurring string with frequency 2.

Example 2:

Input: 
N = 6
arr[] = {geek, for, geek, for, geek, aaa}
Output: for
Explanation: "for" is the second most
occurring string with frequency 2.*/
