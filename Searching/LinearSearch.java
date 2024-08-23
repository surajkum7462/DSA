package Searching;

public class LinearSearch {


         public  static int LinearSearch(int a[],int n,int x)
         {
              for(int i=0;i<n;i++)
              {
                if(a[i]==x)
                {
                    return i;
                }
              }
              return -1;
         }

    public static void main(String[] args) 
    {
        int a[]={23,1,67,62,45,4,2,33};
        System.out.println("The element of array is:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int pos=LinearSearch(a,a.length,80);
        if(pos==-1)
        {
            System.out.println("The searching element is not found");
        }
        else
        {
            System.out.println("The element is found at position :"+(pos+1));
        }
    }

    
    
}
