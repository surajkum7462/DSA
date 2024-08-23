package SIngleLinkedList;
import java.util.Scanner;
public class SingleLinkedList1 
{
    private ListNode head;
    private static class ListNode  // Implementation of Single Linked List
    {
        private int data;
        private ListNode next;

        public ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }




      public void createSLL()  // Creation of Single Linked List
      {
        //Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the first element of singly linked list:");
        // int a=sc.nextInt();
        ListNode first=new ListNode(2);
        // System.out.println("Enter the second element of singly linked list:");
        // int b=sc.nextInt();
        ListNode second=new ListNode(8);
        // System.out.println("Enter the third element of singly linked list:");
        // int c=sc.nextInt();
        ListNode third=new ListNode(1);
       
        // System.out.println("Enter the fourth element of singly linked list:");
        // int d=sc.nextInt();
        ListNode fourth=new ListNode(3);
        // System.out.println("Enter the fifth element of singly linked list:");
        // int e=sc.nextInt();
        ListNode fifth=new ListNode(5);
        // System.out.println("Enter the sixth element of singly linked list:");
        // int f=sc.nextInt();
        ListNode sixth=new ListNode(9);
        head=first;
        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
      }






      public void printLinkedList() // Printing the elements of Single Linked List
      {
        ListNode current =head;
        System.out.println("The elements of Singly Linked List is:");
        while(current!=null)
        {
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
      }

     


      public void findLength()
      {
        ListNode current = head;
        int length=0;
        while(current!=null)
        {
            length++;
            current=current.next;
        }
        System.out.println("The total length of single linked list is:"+length);
      }




      public void inser_at_begin() //inserting the elements of at begin of the sll
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements you want to insert at the begin position of the sll:");
        int x=sc.nextInt();
        ListNode newNode=new ListNode(x);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            newNode.next=head;
            head=newNode;
        }
        System.out.println("After inserting the elements at the begin:");
        printLinkedList();
      }



      public void inser_at_end()  //inserting the elements of at end of the sll
      {
          // 2-->8-->1-->3-->5-->9-->null
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements you want to insert at the last position of sll:");
        int x=sc.nextInt();
        ListNode newNode=new ListNode(x);
        ListNode current =head;
        if(head==null)
        {
            head=newNode;
        }  
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=newNode;
        System.out.println("After inserting the elements at the end position :");
        printLinkedList();
     }






     public void ins_at_any() // inserting the elements of at begin of the sll
     {

          // 2-->8-->1-->3-->5-->9-->null
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements you want to insert :");
        int x=sc.nextInt();
        ListNode newNode=new ListNode(x);
        
        System.out.println("Enter the position");
        int position=sc.nextInt();
        int count=1;
        ListNode current=head;
        if(position==1)
        {
                newNode.next=head;
                head=newNode; 
        }
        else
        {  
                while(count<position-1)
                {
                    
                    current=current.next;
                    count++;
                }
                ListNode prev=current.next;
                current.next=newNode;
                newNode.next=prev;
        }
        System.out.println("After insert the elements:");
        printLinkedList();
     }


       




    public void del_at_beg()
    {
        ListNode temp;
        ListNode current=head;
        if(head==null)
        {
            System.out.println("The List is empty");
        }
        else
        {
            temp=current;
            head=temp.next;
            System.out.println("The deleted element is:"+temp.data);
        }
        printLinkedList();
       
    }


    public void del_at_end()
    {
        // 2-->8-->1-->3-->5-->9-->null
        ListNode current=head;
        ListNode temp;
        ListNode prev=null;
        if(head==null)
        {
            System.out.println("The List is empty");
        }
       else
       {
        while(current.next!=null)
        {
            prev=current;
            current=current.next;
        }
        prev.next=null;
        temp=current;
        temp.next=null;
        System.out.println("The last deleted  element is:"+temp.data);
    }
        printLinkedList();
    }



    public void del_at_any()
    {
         // 2-->8-->1-->3-->5-->9-->null
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the position you want to delet");
        int position=sc.nextInt();
        ListNode current=head;
        ListNode temp;
        int count=1;

        if(position==1)
        {
            del_at_beg();
        }
        else
        {
            while(count < position-1)
            {
                
                current=current.next;
                count++;
            }
            temp=current.next;
            current.next=temp.next;
            temp.next=null;
            System.out.println("The deleted element at position "+position+" is:"+temp.data);

        }
        printLinkedList();   
    }


    public boolean search()
    {
        // 2-->8-->1-->3-->5-->9-->null
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements you want to search:");
        int searchKey=sc.nextInt();
        ListNode current=head;
       if(head==null)
       {
        return false;
       }
        while(current!=null)
        {
            if(current.data==searchKey)
            {
                
                return true;
               
                
            }
            
            
            current=current.next;
        }
     
        return false;
        
    }


      public void reverse()
      {
         // 2-->8-->1-->3-->5-->9-->null
          ListNode current=head;
          ListNode prev=null;
          ListNode next=null;
        System.out.println("The reverse is:");
          while(current!=null)
          {
             next=current.next;
             current.next=prev;
             prev=current;
             current=next;
          }
          head=prev;
          printLinkedList();


      }




     








      

    public static void main(String[] args) 
    {
        SingleLinkedList1 sll=new SingleLinkedList1();
        Scanner sc=new Scanner(System.in);


        sll.createSLL(); //Calling the creation of sll


        sll.printLinkedList(); //calling the function of sll

        sll.findLength();// calling the fun of find length


        sll.inser_at_begin(); //calling the function of  insert at begin

        sll.inser_at_end();  ///calling the function of insert at end

        sll.ins_at_any();   // calling the function of insert at end


        sll.del_at_beg();


        sll.del_at_end();


        sll.del_at_any();





       boolean b= sll.search();
       System.out.println("Element is found:"+b);


       sll.reverse();
    }
}
