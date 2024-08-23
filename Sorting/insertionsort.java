package Sorting;


public class insertionsort {
    
   public static void insertionSort(int arr[],int n)
   {
    for(int i=1;i<n;i++)
    {
        int temp=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>temp)
        {
            arr[j+1]=arr[j];
            j--;
        }
         arr[j+1]=temp;
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
        insertionSort(a, n);
        System.out.println("After Sorting");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }

    

}
