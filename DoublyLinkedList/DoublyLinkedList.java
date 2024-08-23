package DoublyLinkedList;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
    
         private ListNode head;
         private ListNode tail;
         private int length;


    private static class ListNode
    {
        int data;
        ListNode previous;
        ListNode next;

        public ListNode(int data)
        {
            this.data=data;
            this.previous=null;
            this.next=null;
        }
    }


    public DoublyLinkedList()
    {
        this.head=null;
        this.tail=null;
        this.length=0;
    }

    public boolean isEmpty()
    {
        return length==0;
    }
    public int length()
    {
        return length;
    }


    public void createDll(int data)
  {
    ListNode newNode=new ListNode(data);
    if(head==null)
    {
        head=tail=newNode;
        head.previous=null;
        tail.next=null;

    }
    else
    {
        tail.next=newNode;
        newNode.previous=tail;
        tail=newNode;
        tail.next=null;
    }
  }


  public void inser_at_begin(int data)
  {
    ListNode newNode=new ListNode(data);
    if(head==null)
    {
        head=tail=newNode;
        head.previous=null;
        head.next=null;
    }
    else
    {
        head.previous=newNode;
        newNode.next=head;  
        head=newNode;
        head.previous=null;
    }
  }
  public void ins_at_end(int data)
  {
    ListNode newNode=new ListNode(data);
    if(head==null)
    {
        head=tail=newNode;
        head.previous=null;
        head.next=null;
    }
    else
    {
        tail.next=newNode;
        newNode.previous=tail;
        tail=newNode;
        tail.next=null;
    }
  }


  public void ins_at_any(int data,int position)
  {
      // 7<-->4<-->8<-->3<-->1<-->9<-->6<-->null
      ListNode newNode=new ListNode(data);
      ListNode current=head;
      int count=1;
      while(count < position-1)
      {
          current=current.next;
          count++;
      }
      ListNode prev=current.next;
      current.next=newNode;
      newNode.previous=current;
      prev.previous=newNode;
      newNode.next=prev;
  }

  public void delete_at_begin()
  {
    if(head==null)
    {
        System.out.println("The List is Empty");
    }
    
    ListNode temp;
    if(head==tail)
    {
        temp=head;
        head=null;
        System.out.println("The deleted element at begin is:"+temp.data);
        return;
    }
    else
    {
        temp=head;
        head=temp.next;
        head.previous=null;
        temp.previous=null;
        temp.next=null;
        System.out.println("The deleted element at begin is:"+temp.data);
    }
    printForward();
    printBacward();
  }

  public void delete_at_end()
  {
     // 7<-->4<-->8<-->3<-->1<-->9<-->6<-->null
   
    ListNode temp=tail;
   // ListNode current=head;
    if(head==tail)
    {
        temp=head;
        head=null;
        System.out.println("The deleted element is :"+temp.data);
    }
    else
     {
    //   while(current.next!=null)
    //   {
    //     current=current.next;
    //   }
    //   ListNode prev=current.previous;
    //   temp=current;
    //   temp.previous=null;
    //   prev.next=null;
    //   tail=prev;
        temp=tail;
        tail.previous.next=null;
        tail=tail.previous;
        temp.previous=null;
      System.out.println("The last deleted element is:"+temp.data);

    }
    printForward();
    printBacward();
  }

  public void delete_at_any(int position)
  {
    if(position<0)
    {
        System.out.println("Position no. is not valid");
        return;
    }
    if(position==1)
    {
        delete_at_begin();
    }
    else
    {
       // 9<-->1<-->3<-->8<-->5<-->4<-->null
        ListNode current=head;
        ListNode temp;
        int count=1;
        while(count < position-1)
        {
            current=current.next;
            count++;
        }
        temp=current.next;
        current.next=temp.next;
        temp.next.previous=current;
        
        
        temp.next=null;
        temp.previous=null;
        System.out.println("The element deleted at position "+position+" is:"+temp.data);
    }
    printForward();
    printBacward();
  }






    public void printForward()
    {
        if(head==null)
        {
            System.out.println("The list is empty");
            return;
        }
        ListNode temp=head;
        System.out.println("In Forward Direction");
        while(temp!=null)
        {
            System.out.print(temp.data+"<-->");
            temp=temp.next;
        }
        System.out.println("null");
    }



    public void printBacward()
    {
        if(tail==null)
        {
            System.out.println("The list is empty");
            return;
        }
        ListNode temp=tail;
        System.out.println("In Bacward Direction");
        while(temp!=null)
        {
            System.out.print(temp.data+"<-->");
            temp=temp.previous;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        DoublyLinkedList dll=new DoublyLinkedList();
        
        dll.createDll(4);
        dll.createDll(8);
        dll.createDll(3);
        dll.createDll(1);
        dll.createDll(9);
        


        

        dll.inser_at_begin(7);
        dll.ins_at_end(6);
        dll.ins_at_any(5, 3);
        dll.printForward();
        dll.printBacward();


        dll.delete_at_begin();
      
       dll.delete_at_end();
       dll.delete_at_any(3);
 
       
    }
}
