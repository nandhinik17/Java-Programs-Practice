/*Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]*/


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

       for(int i=0; i<numRows; i++){
       List<Integer> result = new ArrayList<>();
        for(int j=0; j<=i; j++){
               if(j==0 || i==j){
                result.add(1);
               }
               else{
                //i--> 2 j--> 1 (1 row 0 value)+ (1 row 1 value)
                int val = list.get(i-1).get(j-1) + list.get(i-1).get(j);
                result.add(val);
               }
        }
        list.add(result);
       }
       return list;
    }
}
