package Hashing;

public class HashTable {
    private HashNode[] buckets;
    private int numOfBuckets;
    private int size;


    
    
    public HashTable(int capacity)
    {
        this.numOfBuckets=capacity;
        buckets=new HashNode[capacity];
        this.size=0;
    }


    private class HashNode
    {
        private Integer key; //can be generic
        private String value; //can be generic

        private HashNode next;//refrence to  next HashNode



        public HashNode(Integer key,String value)
        {
            this.key=key;
            this.value=value;
        }
    }


    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size==0;
    }

    public void put(Integer key,String value)
    {
        if(key==null || value==null)
        {
            System.out.println("Key is empty");
        }
       int bucketIndex=getBucketIndex(key);
       HashNode head=buckets[bucketIndex];

       while(head!=null)
       {
        if(head.key.equals(key))
        {
            head.value=value;
            return;
        }
        head=head.next;
       }
       size++;
       head=buckets[bucketIndex];
       HashNode node=new HashNode(key, value);
       node.next=head;
       buckets[bucketIndex]=node;

    }

    public int getBucketIndex(Integer key)
    {
        return key%(numOfBuckets);
    }
    public String get(Integer key)
    {
        if(key==null)
        {
            System.out.println("The key is empty");
        }
        int bucketIndex=getBucketIndex(key);
        HashNode head=buckets[bucketIndex];
        while(head!=null)
        {
            if(head.key.equals(key))
            {
                return head.value;
            }
            head=head.next;
        }
        return null;
    }

    public String remove(Integer key)
    {
        if(key==null)
        {
            System.out.println("The key is empty");
        }
        int bucketIndex=getBucketIndex(key);
        HashNode head=buckets[bucketIndex];
        HashNode prev=null;
        
        while(head!=null)
        {
            if(head.key.equals(key))
            {
              
                break;
            }
            prev=head;
            head=head.next;
        }
        if(head==null){return null;}
        size--;
        if(prev!=null)
        {
            prev.next=head.next;
        }
        else{
            buckets[bucketIndex]=head.next;
        }
        return head.value;
    }

    public static void main(String[] args) {
        HashTable table=new HashTable(10);
         table.put(10,"Jame");
         table.put(21, "sana");
         table.put(31,"Dinesh");
         System.out.println(table.size());
         System.out.println(table.get(31));
        //  System.out.println(table.get(21));
        //  System.out.println(table.get(21));
         System.out.println(table.remove(21));
         System.out.println(table.size());
    }

    
}
