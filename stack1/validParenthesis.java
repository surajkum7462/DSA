package stack1;
import java.util.Stack;
public class validParenthesis {

    //"}{"
    public static boolean isValid(String s)
    {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c=='{' || c=='[' || c=='(')
            {
                stack.push(c);
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                else
                {
                    char top=stack.peek();
                    if((c=='}' && top=='{') ||
                       (c==']' && top=='[' ) ||
                       (c==')' && top=='('))
                       {
                        stack.pop();
                       }
                       else
                       {
                        return false;
                       }
                }
            }
        }
        return stack.isEmpty();

    }
    public static void main(String[] args) {
        String s="{()}";
        System.out.println("The String is:"+s);
        boolean b=isValid(s);
        System.out.println("The String is:"+b);
    }
    
}
