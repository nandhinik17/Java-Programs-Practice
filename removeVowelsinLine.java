public class removeVowelsinLine {
/*Remove vowels from string
Given a string s. Your task is to remove the vowels from the string.

Examples:
Input: s = "welcome to geeksforgeeks"
Output: "wlcm t gksfrgks"
Explanation: Vowels were ignored only consonents were retuherned in the same order.*/

    public static void main(String[] args) {
        String string1 = "welcome to geeksforgeeks";
        string1 = string1.replace(String.valueOf('a'), "");
        string1 = string1.replace(String.valueOf('e'), "");
        string1 = string1.replace(String.valueOf('i'), "");
        string1 = string1.replace(String.valueOf('o'), "");
        string1 = string1.replace(String.valueOf('u'), "");
        System.out.println(string1);
        
    }
}
