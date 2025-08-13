/*Given an array of integers arr, replace each element with its rank.

The rank represents how large the element is. The rank has the following rules:

Rank is an integer starting from 1.
The larger the element, the larger the rank. If two elements are equal, their rank must be the same.
Rank should be as small as possible.
 

Example 1:

Input: arr = [40,10,20,30]
Output: [4,1,2,3]
Explanation: 40 is the largest element. 10 is the smallest. 20 is the second smallest. 30 is the third smallest.*/


class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int l = arr.length;
        int[] arr1 = new int[l];
         int[] result = new int[l];
         int k=0;
         for(int x: arr){
            arr1[k++] = x;
         }
        Arrays.sort(arr1);
        int rank = 1;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int n: arr1){
            if(!map.containsKey(n)){
           map.put(n, rank);
           rank++;
            }
        }
        int i=0;
        for(int n: arr){
         result[i++]=map.get(n);
        }
        return result;
    }
}
