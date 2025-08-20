
/*You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

For each index i, names[i] and heights[i] denote the name and height of the ith person.

Return names sorted in descending order by the people's heights.

 

Example 1:

Input: names = ["Mary","John","Emma"], heights = [180,165,170]
Output: ["Mary","Emma","John"]
Explanation: Mary is the tallest, followed by Emma and John.*/

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
          People p[] = new People[names.length];
        for(int i=0; i<names.length; i++){
            p[i]= new People(names[i], heights[i]);
        }


       Arrays.sort(p, (a, b)->b.height- a.height);
       String result[] = new String[names.length];
       for(int j=0; j<names.length; j++){
            result[j]= p[j].name;
        }
        return result;
    }
}

class People{
String name;
int height;

People(String name, int height){
    this.name= name;
    this.height= height;
}

}
