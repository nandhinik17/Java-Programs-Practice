
/*You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false.

 

Example 1:

Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.*/

class determineStringHalvesAreAlike {
    public boolean halvesAreAlike(String s) {
        String str = s.substring(0, s.length()/2);
        String str1 = s.substring(s.length()/2, s.length());

        int count =0;
        int count1 = 0;

        for(char ch : str.toCharArray()){

            if(ch =='a' || ch =='e' || ch =='i' || ch=='o'|| ch=='u' || ch =='A' || ch =='E' || ch =='I' || ch=='O'|| ch=='U'){
                count++;
            }
        }
        for(char ch1 : str1.toCharArray()){

            if(ch1 =='a' || ch1 =='e' || ch1 =='i' || ch1=='o'|| ch1=='u'|| ch1 =='A' || ch1 =='E' || ch1 =='I' || ch1=='O'|| ch1=='U'){
                count1++;
            }
        }
        if(count1 ==count){
            return true;
        }

        return false;
    
    }
}
