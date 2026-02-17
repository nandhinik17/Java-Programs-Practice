
/* password is said to be strong if it satisfies all the following criteria:

It has at least 8 characters.
It contains at least one lowercase letter.
It contains at least one uppercase letter.
It contains at least one digit.
It contains at least one special character. The special characters are the characters in the following string: "!@#$%^&*()-+".
It does not contain 2 of the same character in adjacent positions (i.e., "aab" violates this condition, but "aba" does not).
Given a string password, return true if it is a strong password. Otherwise, return false.*/

class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int lCount =0;
        int uCount =0;
        int dCount =0;
        int spCount =0;
        if(password.length()<8){
            return false;
        }
        for(char ch: password.toCharArray()){
            if(Character.isDigit(ch)){
                dCount++;
            }
            else if(Character.isUpperCase(ch)){
                uCount++;
            }
            else if(Character.isLowerCase(ch)){
                lCount++;
            }
            else{
                spCount++;
            }

        }

        for(int i=0; i<password.length()-1; i++){
            if(password.charAt(i)==password.charAt(i+1)){
                return false;
            }
        }
        if(lCount>=1 && uCount>=1 && dCount>=1 && spCount>=1 ){
            return true;
        }
        return false;
    }
}
