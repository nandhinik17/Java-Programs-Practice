import java.util.*;

class PartiesSeats
 {
     public static void Election2019(String party[], int seats[])
    {
        Map<String, Integer> map = new TreeMap<String, Integer>();
        int index=0;
        for(String s: party){
            map.put(s, seats[index]);
            index++;
        }
        Integer max=0;
        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e.getKey() + " "+ e.getValue());
            if(e.getValue()>max){
                max=e.getValue();
            }
           
        }
         System.out.println(max);
    }
    public static void main(String[] args) {
        String s[]= new String[]{"A","B","C", "D", "E" , "F", "G"};
        int arr[]=new int[]{90, 150, 33, 23, 17, 500, 2};
        Election2019(s, arr);
    }
}

/*Question-
Given two arrays, one is array of political parties namely -  party, and their corresponding array of seats received - seats. You have to print the political parties in lexicographical sorted order along with their seats, and highest seats received by the party.

Input Format:
The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase contains three lines of input. The first line contains number of parties N. The second line contains the names of the parties. The third line contains the votes corresponding to each party.

Output Format:
For each testcase, in a new line, print the required answer.

User Task:
Your task is to complete the function Election2019(party, seats, n)  which accepts three arguments and prints the required result.

Constraints:
1 <= T<= 100
1 <= N <= 26
1 <= seats <= 543

Examples:
Input:
1
7
A B C D E F G
90 150 33 23 17 500 2
Output:
A 90
B 150
C 33
D 23
E 17
F 500
G 2
500*/
