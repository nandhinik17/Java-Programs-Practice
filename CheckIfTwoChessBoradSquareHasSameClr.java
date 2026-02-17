/*You are given two strings, coordinate1 and coordinate2, representing the coordinates of a square on an 8 x 8 chessboard.
Below is the chessboard for reference.
Return true if these two squares have the same color and false otherwise.
The coordinate will always represent a valid chessboard square. The coordinate will always have the letter first (indicating its column), and the number second (indicating its row).
Example 1:
Input: coordinate1 = "a1", coordinate2 = "c3"
Output: true
Explanation:
Both squares are black.*/

class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int sum1 = 0;
        int sum2=0;
        for(char ch1: coordinate1.toCharArray()){
            if(Character.isDigit(ch1)){
                sum1 = sum1 + ch1 -'0';
                continue;
            }
           sum1 = sum1 + ch1-'a';
        }
        for(char ch2: coordinate2.toCharArray()){
            if(Character.isDigit(ch2)){
                sum2 = sum2 + ch2 -'0';
                continue;
            }
           sum2 = sum2 + ch2-'a';
        }
        if(sum1%2 == sum2%2){
            return true;
        }
        return false;
    }
}
