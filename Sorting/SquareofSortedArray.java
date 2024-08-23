package Sorting;

public class SquareofSortedArray {
    

    public static int[] sortedSquare(int a[])
    {
        int n=a.length;
        int i=0;
        int[] result=new int[n];
        int j=n-1;
        //  int a[]={-11,-4,-1,3,10,0};

        for(int k=n-1;k>=0;k--)
        {
            if(Math.abs(a[i])>Math.abs(a[j]))
            {
                result[k]=a[i]*a[i];
                i++;
            }
            else
            {
                result[k]=a[j]*a[j];
                j--;
            }
        }
        return result;
    }





    public static void main(String[] args) {
        int a[]={-11,-4,-1,0,3,10};
        System.out.println("Your array's elements is:");
        for(int i=0;i<a.length;i++)
        {
             System.out.print(a[i]+" ");
        }
        System.out.println();
        int[] result=sortedSquare(a);
        System.out.println("Sorted Square is:");
        for(int i=0;i<result.length;i++)
        {
             System.out.print(result[i]+" ");
        }
    }
}
