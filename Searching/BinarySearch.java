package Searching;

public class BinarySearch {


         public  static int BinarySearch(int a[],int l,int h,int x)
         {
             while(l<=h)
             {
                 int mid=(l+h)/2;
                 if(a[mid]==x)
                 {
                    return mid;
                 }
                 else if(a[mid]<x)
                 {
                  l=mid+1;
                 }
                 else
                 {
                    h=mid-1;
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
        int pos=BinarySearch(a,0,a.length-1,33);
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
