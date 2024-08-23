package Sorting;

public class MergeSort {


    public static void mergeSort(int arr[],int temp[],int low,int high)
    {
        if(low<high)
        {
            int mid=low+(high-low)/2;
            mergeSort(arr, temp, low,mid);
            mergeSort(arr, temp, mid+1, high);
            merge(arr,temp,low,mid,high);
        }
    }
    
    private static  void merge(int arr[],int[] temp,int low,int mid,int high)
    {
        for(int i=low;i<=high;i++)
        {
            temp[i]=arr[i];
        }

        int i=low;// traverse left sub array
        int j=mid+1; // traverse right sub array
        int k=low;  // will merge both arrays into original array
        while(i<=mid && j<=high)
        {
            if(temp[i]<=temp[j])
            {
                arr[k]=temp[i];
                i++;
            }else{
                arr[k]=temp[j];
                j++;
            }
            k++;
        }
        while(i<=mid)
        {
            arr[k]=temp[i];
            i++;k++;
        }
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
        mergeSort(a,new int[a.length],0,n-1);
        System.out.println("After Sorting");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}
