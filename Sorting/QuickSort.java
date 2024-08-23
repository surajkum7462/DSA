package Sorting;

public class QuickSort {







        public static void  quickSort(int arr[],int low,int high)
         {
             if(low<high)
             {
                int p=partition(arr, low, high);
                quickSort(arr,low,p-1);
                quickSort(arr, p+1, high);
             }
         }
  

       public static int partition(int arr[] ,int low,int high)
       {
        int i=low;
        int pivot=arr[high];
        int j=low;


           while(i<=high)
           {
            if(arr[i]<=pivot)
            {
                  int temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
                  j++;
            }
            i++;
           }
           return j-1;
       }


    public static void main(String[] args) {
        

        int a[]={5,1,9,7,2,6,8};
        int n=a.length;
       // int[] temp=new int[n];
        System.out.println("Before Sorting");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        quickSort(a,0,n-1);
        System.out.println("After Sorting");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}
