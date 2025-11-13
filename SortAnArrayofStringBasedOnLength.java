/*You are given an array arr[] of strings. Your have  to sort the array in ascending order based on the lengths of the strings. If two strings have the same length, maintain their original relative order.

Examples:

Input: arr[] = ["GeeksforGeeeks", "I", "from", "am"]
Output: ["I", "am", "from", "GeeksforGeeks"]
Explanation: The strings are sorted in increasing order of their lengths, starting from the shortest string "I" to the longest one "GeeksforGeeeks".*/


class Solution {
    public void sortByLength(String[] arr) {
        ArrayList<String> list = new ArrayList<String>();
        for(String s: arr){
            list.add(s);
        }
        list.sort((a, b)-> a.length()-b.length());
        int k=0;
        for(String str: list){
            arr[k++]= str;
        }
        
    }
}
