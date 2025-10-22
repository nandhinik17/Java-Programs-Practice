
/*Given a string s, reverse the string according to the following rules:

All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it.

 

Example 1:

Input: s = "ab-cd"
Output: "dc-ba"
Example 2:

Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
Example 3:

Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"*/


class reverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        int left =0;
        int right = s.length()-1;
        char str[] = s.toCharArray();
        while(left<right){
           
          while(left<right && !Character.isLetter(str[left]))
          {
            left++;
          }
           while(left<right  && !Character.isLetter(str[right]) )
          {
            right--;
          }

           char temp = str[left];
           str[left]= str[right];
           str[right]=temp;
           left++;
           right--;
}

return new String(str);
    }
}
