// Given a binary string S. The task is to count the number of substrings that start and end with 1. For example, if the input string is “00100101”, then there are three substrings “1001”, “100101” and “101”.
// Input:
// N = 4
// S = 1111
// Output: 6
// Explanation: There are 6 substrings from
// the given string. They are 11, 11, 11,
// 111, 111, 1111.


class BinarySubStringStartWithOne {
    public static void main(String[] args) {
       String str = "1111";
       char arr[] = str.toCharArray();
       int count=0;
       for(char ch: arr){
           if(ch=='1'){
               count++;
           }
       }
       System.out.println(count*(count-1)/2);
    }
}
