/*Given an array arr[]. Your task is to find the minimum and maximum elements in the array.

Examples:

Input: arr[] = [1, 4, 3, -5, -4, 8, 6]
Output: [-5, 8]
Explanation: minimum and maximum elements of array are -5 and 8.
Input: arr[] = [12, 3, 15, 7, 9]
Output: [3, 15]
Explanation: minimum and maximum element of array are 3 and 15.*/

class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(arr);
        list.add(Integer.valueOf(arr[0]));
        list.add(Integer.valueOf(arr[arr.length-1]));
        return list;
        
    }
}

  
