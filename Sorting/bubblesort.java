package Sorting;

public class bubblesort {



    public static void bubbleSort(int a[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int a[]={5,1,9,7,2,6,8};
        int n=a.length;
        System.out.println("Before Sorting");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        bubbleSort(a, n);
        System.out.println("After Sorting");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
    
}
