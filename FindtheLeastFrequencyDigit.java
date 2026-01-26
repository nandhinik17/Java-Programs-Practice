/*Given an integer n, find the digit that occurs least frequently in its decimal representation. If multiple digits have the same frequency, choose the smallest digit.
Return the chosen digit as an integer.
The frequency of a digit x is the number of times it appears in the decimal representation of n.
Example 1:
Input: n = 1553322
Output: 1
Explanation:
The least frequent digit in n is 1, which appears only once. All other digits appear twice.
Example 2:
Input: n = 723344511
Output: 2
Explanation:
The least frequent digits in n are 7, 2, and 5; each appears only once.*/


class Solution {
    public int getLeastFrequentDigit(int n) {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        while(n>0){
            int temp = n%10;
            if(!map.containsKey(temp)){
              map.put(temp, 1);
            }
            else{
                map.put(temp, map.get(temp)+1);
            }
            n=n/10;
        }
      int minVal = Integer.MAX_VALUE;
      int val=-1;
      for(Map.Entry<Integer, Integer> e : map.entrySet()){
        if(e.getValue()<minVal){
            minVal = e.getValue();
            val = e.getKey();
        }
      }

      return val;
    }
}
