
/*You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition. All the scores are guaranteed to be unique.

The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:

The 1st place athlete's rank is "Gold Medal".
The 2nd place athlete's rank is "Silver Medal".
The 3rd place athlete's rank is "Bronze Medal".
For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
Return an array answer of size n where answer[i] is the rank of the ith athlete.

 

Example 1:

Input: score = [5,4,3,2,1]
Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].*/


class Solution {
    public String[] findRelativeRanks(int[] score) {
        Integer arr[] = new Integer[score.length];
        Integer k=0;
        for(int n: score){
            arr[k++]= n;
        }
        Arrays.sort(arr, (a, b)->{
           return b-a;
        });
     Map<Integer, String> map = new HashMap<Integer, String>();
     for(int i=0;i<score.length;i++){
        if(i<=2){
        if(i==0){
            map.put(arr[i], "Gold Medal");
        }
        if(i==1){
            map.put(arr[i], "Silver Medal");
        }
        if(i==2){
            map.put(arr[i], "Bronze Medal");
        }
        }
        else{
         map.put(arr[i], String.valueOf(i+1));
        }

     }

     String str[] = new String[score.length];
     int val=0;
     for(int i=0;i<score.length;i++){
         str[val++]= map.get(score[i]);
     }
     return str;
    

    }
}
