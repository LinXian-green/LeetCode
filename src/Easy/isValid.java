package Easy;

import java.util.Stack;

public class isValid {
    public static void main(String[] args){
        String s = "]";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack stack = new Stack();
        //stack.setSize(s.length());

        for(int  j=0; j<s.length(); j++){
            char ch = s.charAt(j);
            switch(ch){
                case '{':
                case '[':
                case '(':
                    stack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if(!stack.isEmpty())
                    {
                        char chx = (char) stack.pop();
                        if((ch=='}' && chx !='{') ||
                           (ch == ']' && chx != '[')||
                           (ch==')' && chx !='(')){
                            return false;
                        }

                    }else{
                        return false;
                    }
                    break;
                default: break;

            }
        }
        if(!stack.isEmpty())
            return false;
        return true;
    }
}
