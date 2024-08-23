package Sorting;

public class Selectionsort {


       public static void SelectionSort(int arr[], int n)
       {
        for(int i=0;i<n-1;i++)
        {
           int  min=i;

           for(int j=i+1;j<n;j++)
           {
            if(arr[j]<arr[min])
            {
                min=j;
            }
          }
          int temp=arr[min];
          arr[min]=arr[i];
          arr[i]=temp;

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
        SelectionSort(a, n);
        System.out.println("After Sorting");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
