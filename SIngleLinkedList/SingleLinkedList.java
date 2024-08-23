package SIngleLinkedList;
//implementation of single linked list
//Printing the elements

import org.w3c.dom.Node;

public class SingleLinkedList {
    private ListNode head;

    private static class ListNode
    {
        private int data;//Generic type

        private ListNode next;

        public ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

//Printing the elemnts of Linked List
      public void printLinkedList(ListNode head)
      {
        ListNode currentNode=head;
        while(currentNode!=null)
        {
         System.out.print(currentNode.data+"-->");
         currentNode=currentNode.next;
        }
        System.out.println("null");
      }

      //Finding the length of Linked List
      public void lengthSLL()
      {
        int len=0;
        ListNode currentNode=head;
        while(currentNode!=null)
        {
         len++;
         currentNode=currentNode.next;
        }
        System.out.println("The length of linked list is:"+len);
      }
                 //inserting the node at the beginning of linked list
                    public void inser_at_begin(int value)
                {
                    
                  
                    ListNode  newNode=new ListNode(value);
                    newNode.next=head;
                    head=newNode;
                    
                }

        public void insert_at_end(int value)
        {
            ListNode newNode=new ListNode(value);
            if(head==null)
            {
                head=newNode;
                return;
            }
           
               ListNode current=head;
               while(current.next!=null)
               {
                 
                current=current.next;
               }
               current.next=newNode;
              
               
        }

        //inserting at the any position

        public void ins_at_any(int data,int position)
        {
           // 10-->1-->8-->11-->null
            ListNode node=new ListNode(data);
            if(position==1)
            {
                node.next=head;
                head=node;
            }
            else{
                ListNode previous=head;
                int count=1;
                while(count < position-1)
                {
                    previous=previous.next;
                    count++;
                }
                ListNode current=previous.next;
                previous.next=node;
                node.next=current;

            }
        }
          public void del_at_beg()
          {
            // 10-->10-->12-->1-->8-->11-->null

            if(head==null)
            {
                System.out.println("The List is Empty");
             
            }
            else
            {
                ListNode temp=head;
                head=temp.next;
                temp.next=null;
                System.out.println("The deleted element is:"+temp.data);
            }
            
           
           
          }
          public void del_at_end()
          {
            if(head==null || head.next==null)
            {
                System.out.println("The deleted element is:"+head.data);                
            }
            ListNode current =head;
            ListNode prev=null;
         // 10-->1-->8-->11-->null
            while(current.next!=null)
            {
                prev=current;
                current=current.next;
            }
            prev.next=null;
            ListNode temp=current;
            temp.next=null;
            System.out.println("The deleted element is:"+temp.data);
           

          }
        public void del_at_any(int position)
        {
            if(position==1)
            {
                ListNode temp=head;
                head=head.next;
                temp.next=null;
                System.out.println("The Deleted element is: "+temp.data);
            }
           
            ListNode prev=head;
            int count=1;
            while(count<position-1)
            {
                // 10-->1-->6-->8-->null
                
                prev=prev.next;
                count++;
            }
            ListNode temp=prev.next;
            prev.next=temp.next;
            temp.next=null;
            System.out.println("The deleted element is:"+temp.data);

        }
        public boolean search(int searchKey)
        {
            if(head==null)
            {
                return false;
            }
            ListNode current=head;
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
        public ListNode reverse()
        {
            // 42-->10-->1-->8-->99-->null
            if(head==null)
            {
               return head;
            }
            ListNode current=head;
            ListNode prev=null;
            ListNode next=null;
            while(current!=null)
            {
                next=current.next;
                current.next=prev;
                prev=current;
                current=next;
            }
            return prev;
        }
        public void findMiddle()
        {
            if(head==null)
            {
                System.out.println("The list is empty");
            }
           ListNode slowPtr=head;
           ListNode fastPtr=head;
           while(fastPtr!=null && fastPtr.next!=null)
           {
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
           }
           System.out.println("The Middle element is:"+slowPtr.data);
        }

        // How to find nth node from the end of a Singly Linked List in Java?
        public void getnthnodefromLast(int n)
        {
            lengthSLL();
            if(head == null)
            {
                System.out.println("The list is empty");
            }
            if(n<=0)
            {
                throw new IllegalArgumentException("Invalid choice");
            }
            ListNode mainPtr=head;
            ListNode refPtr=head;
            int count=0;
            while(count < n)
            {
                if(refPtr==null)
                {
                    throw new IllegalArgumentException(n+" is greater than the number of nodes");
                   
                }
                refPtr=refPtr.next;
                count++;
            }
            while(refPtr!=null)
            {
                refPtr=refPtr.next;
                mainPtr=mainPtr.next;
            }
            System.out.println("The element from the last at position "+n+" is:"+mainPtr.data);
        }
         


        public void sortList()
        {
            ListNode current=head;
            ListNode index=null;
            int temp;
            if(head==null)

            {
                return;
            }
            while(current!=null)
            {
                index=current.next;
                while(index!=null)
                {
                    if(current.data > index.data)
                    {
                        temp=current.data;
                        current.data=index.data;
                        index.data=temp;
                    }
                    index=index.next;
                }
                current=current.next;
            }
        }

    public void removeDublicate()
    {
        ListNode current=head;
        while(current!=null && current.next!=null)
        {
            if(current.data==current.next.data)
            {
                current.next=current.next.next;
            }
            else
            {
                current=current.next;
            }
        }

    }
    public void  ins_at_sorted(int value)
    {
        // 1-->8-->10-->42-->93-->99-->null
        ListNode newNode=new ListNode(value);
        if(head == null)
        {
            System.out.println("The  List is empty");
        }
        ListNode current=head;
        ListNode temp=null;
        while ((current!=null && current.data < newNode.data)) 
        {
            temp=current;
            current=current.next;
        }
        newNode.next=current;
        temp.next=newNode;
        System.out.println("After inserting the data:"+newNode.data);
    }



    public void removegivenKey(int key)
    {
        // 1-->8-->10-->42-->93-->99-->null
        ListNode current=head;
        ListNode temp=null;
        while(current!=null && current.data!=key)
        {
            temp=current;
            current=current.next;
        }
        if(current== null)
        {
            return;
        }
        temp.next=current.next;
        System.out.println("The removed element is:"+current.data);
    }


    public boolean containsLoop()
    {
        ListNode fastPtr=head;
        ListNode slowPtr=head;
        while(fastPtr!=null && fastPtr.next!=null)
        {
            fastPtr=fastPtr.next.next;
            slowPtr=slowPtr.next;
            if(slowPtr==fastPtr)
            {
                return true;
            }

        }
        return false;
    }

    public void createaLoop()
    {
        ListNode first=new ListNode(1);
        ListNode second=new ListNode(2);
        ListNode third=new ListNode(3);
        ListNode fourth=new ListNode(4);
        ListNode fifth=new ListNode(5);
        ListNode sixth=new ListNode(6);



        head=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=third;
    }



    public ListNode startnodeINALoop()
    {
        ListNode fastPtr=head;
        ListNode slowPtr=head;
        while(fastPtr!=null && fastPtr.next!=null)
        {
            fastPtr=fastPtr.next.next;
            slowPtr=slowPtr.next;
            if(slowPtr==fastPtr)
            {
                return getstartingNode(slowPtr);
            }

        }
        return null;

    }

    public ListNode getstartingNode(ListNode slowPtr)
    {
        ListNode temp=head;
        while(temp!=slowPtr)
        {
            temp=temp.next;
            slowPtr=slowPtr.next;
        }
        return temp;
    }

    public void removeLoopL()
    {
        ListNode fastptr=head;
        ListNode slowPtr=head;
        while(fastptr!=null && fastptr.next!=null)
        {
             fastptr=fastptr.next.next;
             slowPtr=slowPtr.next;
             if(slowPtr==fastptr)
             {
                 removeLoop(slowPtr);
                 return;
             }
        }
        
    }
    private void removeLoop(ListNode slowPtr)
    {
        ListNode temp=head;
        while(temp.next!=slowPtr.next)
        {
            temp=temp.next;
            slowPtr=slowPtr.next;
        }
        slowPtr.next=null;
    }

    public static ListNode merge(ListNode a , ListNode b)
    {
        ListNode dummy =new ListNode(0);
        ListNode tail=dummy;
        while (a!=null &&  b!=null)
        {
            if(a.data<=b.data)
            {
                tail.next=a;
                a=a.next;
            }
            else
            {
                tail.next=b;
                b=b.next;
            }
            tail=tail.next;
        }
        if(a==null)
        {
            tail.next=b;
        }
        else
        {
            tail.next=b;
        }
        return dummy.next;
    }


    public static ListNode add(ListNode a, ListNode b)
    {

        // 1-->4-->8-->null
        // 3-->5-->9-->null
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        int carry=0;
        while(a!=null || b!=null)
        {
            int x=(a!=null)?a.data:0;
            int y=(b!=null)?b.data:0;
            int sum=carry+x+y;
            carry=sum/10;
            tail.next=new ListNode(sum%10);
            tail=tail.next;
            if(a!=null)
            {
                a=a.next;
            }
            if(b!=null)
            {
                b=b.next;
            }
        }
        if(carry>0)
        {
            tail.next=new ListNode(carry);
        }
        return dummy.next;
    }









    //      public void sortList() {  
    //     //Node current will point to head  
    //     ListNode current = head;
    //     ListNode index = null;  
    //     int temp;  
          
    //     if(head == null) {  
    //         return;  
    //     }  
    //     else {  
    //         while(current != null) {  
    //             //Node index will point to node next to current  
    //             index = current.next;  
    //               // 42-->10-->1-->8-->99-->93-->null
    //               // Sorted is:1-->8-->10-->42-->93-->99-->null
    //             while(index != null) {  
    //                 //If current node's data is greater than index's node data, swap the data between them  
    //                 if(current.data > index.data) {  
    //                     temp = current.data;  
    //                     current.data = index.data;  
    //                     index.data = temp;  
    //                 }  
    //                 index = index.next;  
    //             }  
    //             current = current.next;  
    //         }      
    //     }  
    // }  




    public static void main(String[] args) {
        SingleLinkedList sll=new SingleLinkedList();
        sll.head=new ListNode(10);
        ListNode second=new ListNode(1);
        ListNode third =new ListNode(8);
        ListNode fourth=new ListNode(11);
        // Now we will connect them together to form a chain


        sll.head.next=second; //10-->1
        second.next=third;//10-->1-->8
        third.next=fourth;//10-->1-->8-->11-->null
        sll.ins_at_any(12,2);
        sll.ins_at_any(10,1);
        sll.printLinkedList(sll.head);
        sll.del_at_beg();
      
       
       
       sll.del_at_end();
       sll.printLinkedList(sll.head);
       sll.del_at_any(2);
       sll.inser_at_begin(42);
        sll.insert_at_end(99);
        sll.insert_at_end(93);
        sll.insert_at_end(1);
        sll.insert_at_end(93);
        
        sll.printLinkedList(sll.head);
        
       boolean search= sll.search(100);
       if(search)
       {
        System.out.println("The element is found");
       }
       else
       {
        System.out.println("The element is not found");
       }
       sll.findMiddle();
      
    //    ListNode reverse=sll.reverse();
    //    System.out.println("The reverse is:");
    //    sll.printLinkedList(reverse);
       sll.getnthnodefromLast(3);
       System.out.println("The Sorted List is:");
       sll.sortList();
       sll.printLinkedList(sll.head);
       sll.removeDublicate();
       System.out.println("After removing dublicate element:");
       sll.printLinkedList(sll.head);
      
       sll.ins_at_sorted(63);
       
       sll.printLinkedList(sll.head);
       sll.removegivenKey(42);
       sll.printLinkedList(sll.head);
       sll.createaLoop();
       System.out.println("Does LinkedList contains the loop:"+sll.containsLoop());
       //sll.printLinkedList(sll.head);
       System.out.println("The loop starts from the data:"+sll.startnodeINALoop().data);
       sll.removeLoopL();
       System.out.println("After removing the loop");
       sll.printLinkedList(sll.head);
       SingleLinkedList sll1=new SingleLinkedList();
       SingleLinkedList sll2=new SingleLinkedList();
       sll1.insert_at_end(9);
       sll1.insert_at_end(4);
       sll1.insert_at_end(8);
       sll2.insert_at_end(5);
       sll2.insert_at_end(5);
       sll2.insert_at_end(9);
       //sll2.insert_at_end(11);
       sll.printLinkedList(sll1.head);
       sll.printLinkedList(sll2.head);
       System.out.println("After Merging the linked list:");
       //ListNode mergNode =merge(sll1.head,sll2.head);
       //sll.printLinkedList(mergNode);
       ListNode temp=add(sll1.head,sll2.head);
       System.out.println("After adding");
       sll.printLinkedList(temp);
      
      // sll.lengthSLL();
    //    ListNode currentNode=sll.head;
    //    while(currentNode!=null)
    //    {
    //     System.out.print(currentNode.data+"-->");
    //     currentNode=currentNode.next;
    //    }
    //    System.out.println("null");

 



    }
}
