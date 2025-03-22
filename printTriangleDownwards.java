import java.util.*;
class printTriangleDownwards {
 static void printTriangleDownwards(String str){
        for(int i=0;i< str.length();i++){
            for(int j=str.length()-1-i; j>0; j--){
                System.out.print(".");
                
            }
            System.out.print(str.substring(0, i+1));
            System.out.println(); 
        }
    }
    public static void main(String[] args) {
         printTriangleDownwards("Geeks");
         printTriangleDownwards("Automation");
    }
}
/*Triangle growing downwards
Given string str of a constant length, print a triangle out of it. The triangle should start with the first character of the string and keep growing downwards by adding one character from the string.
The spaces on the left side of the triangle should be replaced with a dot character. 

Example 1:

Input:
str = "geeks"

Output:
....g
...ge
..gee
.geek
geeks
Example 2:

Input:
str = "thisi"

Output:
....t
...th
..thi
.this
thisi*/
