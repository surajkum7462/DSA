package Queue1;

import java.util.NoSuchElementException;

public class Queue {

     private ListNode front;
     private ListNode rear;
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
                public int length()
                {
                    return length;
                }
                public boolean isEmpty()
                {
                    return length==0;
                }
                public Queue()
                {
                    this.front=null;
                    this.rear=null;
                    this.length=0;
                }
                public void Enqueue(int data)
                {
                    ListNode newNode=new ListNode(data);
                    if(front==null && rear==null)
                    {
                          front =rear=newNode;
                          length++;
                    }
                    else
                    {
                         rear.next=newNode;
                         rear=newNode;
                         length++;
                    }
                }
                public void printQueue()
                {
                    if(isEmpty())
                    {
                        System.out.println("The Queue is Empty");
                    }
                    else
                    {
                        System.out.println("The Elements of queue is:");
                        ListNode current=front;
                        while(current!=null)
                        {
                            System.out.print(current.data+"-->");
                            current=current.next;
                        }
                        System.out.println("null");
                    }
                }
                

                public void Dequeue()
                {
                    if(isEmpty())
                    {
                       throw new NoSuchElementException("The Queue is Empty");
                    }
                   int result=front.data;
                   front=front.next;
                   if(front==null)
                   {
                    rear=null;
                   }
                   System.out.println("The Deleted element is:"+result);
                    printQueue();
                }






    public static void main(String[] args) {
        Queue q=new Queue();
        q.Enqueue(7);
        q.Enqueue(1);
        q.Enqueue(6);
        q.Enqueue(2);
        q.printQueue();
        q.Dequeue();
        
        
        
    }
    
}
