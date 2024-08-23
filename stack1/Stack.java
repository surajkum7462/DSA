package stack1;

public class Stack {
    private ListNode top;
    private int length;

    private class ListNode
    {
        private ListNode next;
        private int data;
        public ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
        
    }
    public Stack()
        {
            top=null;
            length=0;
        }
        public int length()
        {
            return length;
        }

        public void push(int data)
        {
            ListNode temp=new ListNode(data);
            if(top==null)
            {
                top=temp;
            }
            
                temp.next=top;
                top=temp;
                length++;
            
        }
        public void pop()
        {
            ListNode temp;
            if(top==null)
            {
                System.out.println("The Stack is Empty");
            }
            
            
                temp=top;
                top=top.next;
                length--;
                System.out.println("The Popped Element is:"+temp.data);
            
        }
        public void peek()
        {
            if(top==null)
            {
                System.out.println("The List is Empty");
            }
            System.out.println("The Last element is :"+top.data);
        }
        public void printStack()
        {
            System.out.println("The Stack Element is:");
            
            if(top==null)
            {
                System.out.println("The List Is Empty");
            }
            else{
            while(top.next!=null)
            {
                System.out.print(top.data+"|");
              top=top.next;
            }
            System.out.println("null");
        }
        }


    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(2);
        s.push(6);
        s.push(7);
        s.push(3);
        s.push(9);
        s.printStack();
        System.out.println("The Length is:"+s.length());
        s.pop();
        
        System.out.println("The Length is:"+s.length());
        s.peek();
    }
}
