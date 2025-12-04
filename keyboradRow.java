/*Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

Note that the strings are case-insensitive, both lowercased and uppercased of the same letter are treated as if they are at the same row.

In the American keyboard:

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".

 

Example 1:

Input: words = ["Hello","Alaska","Dad","Peace"]

Output: ["Alaska","Dad"]

Explanation:

Both "a" and "A" are in the 2nd row of the American keyboard due to case insensitivity.

Example 2:

Input: words = ["omk"]

Output: []

Example 3:

Input: words = ["adsdf","sfd"]

Output: ["adsdf","sfd"]

 

Constraints:

1 <= words.length <= 20
1 <= words[i].length <= 100
words[i] consists of English letters (both lowercase and uppercase). */


class Solution {
    public String[] findWords(String[] words) {
       List<String> result = new ArrayList<>();
        int k=0;
        Set<Character> set1 = new HashSet<Character>();
         Set<Character> set2 = new HashSet<Character>();
          Set<Character> set3 = new HashSet<Character>();
        for(char ch1: "qwertyuiop".toCharArray()){
            set1.add(ch1);
        }
        for(char ch2: "asdfghjkl".toCharArray()){
            set2.add(ch2);
        }
        for(char ch3: "zxcvbnm".toCharArray()){
            set3.add(ch3);
        }

        for(String s: words){
            String str= s.toLowerCase();
            char fl= str.charAt(0);
            int l = str.length();
            int count=0;
            if(set1.contains(fl)){
               for(char letter: str.toCharArray()){
                if(set1.contains(letter)){
             count++;
                }
               
               }
               if(count==l){
                    result.add(s);
               }
            }
            else if(set2.contains(fl)){
for(char letter1: str.toCharArray()){
                if(set2.contains(letter1)){
 count++;
                }
               
                
               }
               if(count==l){
                      result.add(s);;
               }
            }
            else{
for(char letter2: str.toCharArray()){
                if(set3.contains(letter2)){
                   count++;
                }
               
                
               }
               if(count==l){
                      result.add(s);
               }
            }
        }
        return result.toArray(new String[0]);
    }




}
