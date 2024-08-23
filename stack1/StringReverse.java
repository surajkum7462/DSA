package stack1;
import java.util.Stack;

public class StringReverse {

    public static String reverse(String str)
    {
        Stack<Character> stack=new Stack<>();
        char[] chars=str.toCharArray();
        for(char c:chars)
        {
            stack.push(c);
        }
        for(int i=0;i<str.length();i++)
        {
            chars[i]=stack.pop();
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        StringReverse sr=new StringReverse();
        String str="suraj";
        System.out.println("Before reverse:"+str);
        System.out.println("After reverse:"+sr.reverse(str));
    }
    
}
