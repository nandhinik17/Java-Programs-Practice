/*You are given a 0-indexed string num of length n consisting of digits.

Return true if for every index i in the range 0 <= i < n, the digit i occurs num[i] times in num, otherwise return false.

 

Example 1:

Input: num = "1210"
Output: true
Explanation:
num[0] = '1'. The digit 0 occurs once in num.
num[1] = '2'. The digit 1 occurs twice in num.
num[2] = '1'. The digit 2 occurs once in num.
num[3] = '0'. The digit 3 occurs zero times in num.
The condition holds true for every index in "1210", so return */

class Solution {
    public boolean digitCount(String num) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(char ch : num.toCharArray()){
            int n = ch-'0';
            if(!map.containsKey(n)){
                map.put(n, 1);
            }
            else{
                map.put(n, map.get(n)+1);
            }
        }
        boolean flag = true;
        int i=0;
        for(char ch1 : num.toCharArray()){
          int n1 = ch1-'0';
          if(map.containsKey(i)){
             if(map.get(i)!=n1){
                return false;
             }
          }
          else{
            
            if(n1!=0){
                return false;
             }
          }
          i++;
        }
        return flag;
    }
}
