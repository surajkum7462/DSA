public class ReverseArray {
         
     public  void reverseArray(int a[])
     {
        System.out.println("After Reversing");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
     }
     public void reverseArray1(int a[],int start,int end)
     {
              while(start<end)
              {
                int temp=a[start];
                a[start]=a[end];
                a[end]=temp;
                start++;
                end--;
              }
              for(int i=0;i<a.length;i++)
              {
                System.out.print(a[i]+" ");
              }
     }


    public static void main(String[] args) {
        int a[]={2,9,0,22,12,4,555,12,};
        System.out.println("Befor Reversing");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
       
        ReverseArray RA=new ReverseArray();
        System.out.println("Method 1");
         RA.reverseArray(a);
         System.out.println("Method 2");
        RA.reverseArray1(a,0,a.length-1);
    }   
}
