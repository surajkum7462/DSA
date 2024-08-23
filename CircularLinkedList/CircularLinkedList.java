package CircularLinkedList;

public class CircularLinkedList {
    private ListNode last;
    //private ListNode head;
   
    private int length;


    private class ListNode
    {
        private ListNode next;
        private int data;
       

        public ListNode(int data)
        {
                this.data=data;
        }
    }

    public CircularLinkedList()
    {
        last=null;
       // head=null;
         length=0;
    }

    public boolean isEmpty()
    {
        return length==0;
    }
    public int length()
    {
        return length;
    }


    public void createCSLL(int data)
    {
        ListNode newNode=new ListNode(data);
        if(last==null)
        {
            last=newNode;
            last.next=last;
           
        }
        else
        {
            // 2-->3--> 5
            newNode.next=last.next;
            last.next=newNode;
            last=newNode;

        }
    }





    public void inser_at_begin(int data)
    {
        ListNode newNode=new ListNode(data);
        if(last==null)
        {
            last=newNode;
            last.next=last;
        }
        else
        {
            newNode.next=last.next;
            last.next=newNode;

        }
        System.out.println("After inserting at the begin:"+data);
        printCSLL();
    }

    public void insert_at_end(int data)
    {
        ListNode newNode=new ListNode(data);
        if(last==null)
        {
            last=newNode;
            last.next=last;
        }
        else
        {
            newNode.next=last.next;
            last.next=newNode;
            last=newNode;
        }
        System.out.println("After inserting the element at the end:"+data);
        printCSLL();
    }

    public void del_at_beg()
    {
        ListNode temp;
        if(last==null)
        {
            System.out.println("The List is Empty");
            return;
        }
        else
        {
           temp=last.next;
           last.next=temp.next;
           System.out.println("The first deleted element is: "+temp.data);
        }
        printCSLL();
    }

    public void del_at_end()
    {
        ListNode current=last.next;
        ListNode temp;
        ListNode prev=null;
        if(last==null)
        {
            System.out.println("The List is Empty");
            return;
        }
        else
        {
            // 7-->8-->3-->1-->5-->9-->2-->4
           while(current!=last)
           {
            prev=current;
            current=current.next;
           }
           temp=last;
           prev.next=last.next;
           last=prev;


           System.out.println("The last deleted element is: "+temp.data);
        }
        printCSLL();
    }
    


    public void printCSLL()
    {
         if(last==null)
         {
            System.out.println("The List is Empty");
            return;
         }

         else
         {
             ListNode first=last.next;
             while(first!=last)
             {
             System.out.print(first.data+"-->");
             first=first.next;
             }
             System.out.println(first.data);

         }
    }


    public static void main(String[] args) {
        CircularLinkedList cll=new CircularLinkedList();

        cll.createCSLL(8);
        cll.createCSLL(3);
        cll.createCSLL(1);
        cll.createCSLL(5);
        cll.createCSLL(9);

        cll.printCSLL();
        cll.inser_at_begin(7);
        cll.inser_at_begin(6);
        cll.insert_at_end(2);
        cll.insert_at_end(4);

        cll.del_at_beg();
       // cll.del_at_beg();


       cll.del_at_end();
       cll.del_at_end();
    }




}
