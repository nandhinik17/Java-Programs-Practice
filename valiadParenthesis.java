import java.util.*;
class valiadParenthesis {
    public static boolean isValid(String str){
        Stack<Character> stack = new Stack<Character>();
        for(char ch: str.toCharArray()){
            if(ch=='{' || ch=='(' || ch=='[')
            {
                stack.push(ch);
            }
            else if(ch=='}' || ch==')' || ch==']')
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                 char top= stack.pop();
                    
                    if((ch=='}' && top!='{') || (ch==')' && top!='(') || (ch==']' && top!='['))
                    {
                        return false;
                    }
            }
        }
        return stack.isEmpty();
    }
    
    
    public static void main(String[] args) {
        System.out.println(isValid("()"));       // true
        System.out.println(isValid("()[]{}"));   // true
        System.out.println(isValid("(]"));       // false
        System.out.println(isValid("([)]"));     // false
        System.out.println(isValid("{[]}"));     // true
      
    }
}

