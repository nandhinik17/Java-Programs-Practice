/*Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.

You can use each character in text at most once. Return the maximum number of instances that can be formed.

 

Example 1:



Input: text = "nlaebolko"
Output: 1
Example 2:



Input: text = "loonbalxballpoon"
Output: 2
Example 3:

Input: text = "leetcode"
Output: 0*/


class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(char ch: text.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }
            else{
                map.put(ch, map.get(ch)+1);
            }
        }
      int  b=0, a=0, l=0, o=0, n=0;

         if(map.containsKey('b')){
           b= map.get('b');
         }
         if(map.containsKey('a')){
            a = map.get('a');
         }
         if(map.containsKey('l')){
            l = map.get('l');
         }
         if(map.containsKey('o')){
            o = map.get('o');
         }
         if(map.containsKey('n')){
           n = map.get('n');
         }
          
          
           
           
           
      
      int x = Math.min(b, a);
int y = Math.min(l / 2, o / 2);
int z = Math.min(x, y);
return Math.min(z, n);

    }
}
