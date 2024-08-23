

package stack1;
import java.util.Stack;
  




public class nextg {
    public static int[] nextGreaterEle(int[] a)
            {
            Stack<Integer> stack=new Stack<>();
            int[] result=new int[a.length];
            for(int i=a.length-1;i>=0;i--)
            {
                if(!stack.isEmpty())
                {
                    while(!stack.isEmpty() && stack.peek()<=a[i])
                    {
                        stack.pop();
                    }
                }
                if(stack.isEmpty())
                
                {
                    result[i]=-1;
                }
                else
                {
                    result[i]=stack.peek();
                }
                stack.push(a[i]);
            }
            return result;
            
            }




    public static void main(String[] args) {
      NextGreaterElement ng=new NextGreaterElement();
      int a[]={4,7,3,4,8,1};
      System.out.println("Before");
      for(int i=0;i<a.length;i++)
      {
          System.out.print(a[i]+" ");
      }
      System.out.println();
      int b[]=new int[a.length];
      b=nextGreaterEle(a);
      System.out.println("After");
      for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }
     
  }
  
}
