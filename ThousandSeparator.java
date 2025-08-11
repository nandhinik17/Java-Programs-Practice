/* Thousand Separator
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given an integer n, add a dot (".") as the thousands separator and return it in string format.

 

Example 1:

Input: n = 987
Output: "987"
Example 2:

Input: n = 1234
Output: "1.234"*/



class Solution {
    public String thousandSeparator(int n) {
        String str = String.valueOf(n);
        StringBuilder sb = new StringBuilder(str);
        for(int i=sb.length()-3; i>0;i=i-3){
            //index position which we want to insert
            sb.insert(i, ".");
        }
        return sb.toString();
    }
}
