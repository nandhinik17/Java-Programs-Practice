/*Upper Case Conversion
Given a string s, convert the first letter of each word in the string to uppercase. 

Examples:

Input: s = "gEEKs"
Output: "Geeks"
Input: s = "i love programming"
Output: "I Love Programming" */

class uppercaseFirstLetterinLine {
    public static String firstLetterConversion(String str){
        String arr[] = str.split("\\s+");
        String opVal = "";
        for(String s: arr){
            StringBuilder sb = new StringBuilder(s);
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            opVal = opVal+ sb.toString();
            opVal = opVal+ " ";
        }
        return opVal;
    }
    
    
    public static void main(String[] args) {
        System.out.println(firstLetterConversion("Geeks"));
        System.out.println(firstLetterConversion("i love programming"));
    }
}
