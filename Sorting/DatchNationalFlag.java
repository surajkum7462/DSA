package Sorting;

public class DatchNationalFlag {

       public static void threenumberSort(int arr[])
       {
          int i=0;int j=0;
          int k=arr.length-1;
        //   int arr[]={2,0,2,2,0,1,1,0};
          while(i<=k)
          {
            if(arr[i]==0)
            {
                swap(arr,i,j);
                i++;
                j++;
            }else if(arr[i]==1)
            {
                i++;
            }
            else
            {
                swap(arr,i,k);
                k--;
            }
          }
       }
       public static void swap(int arr[],int i,int j)
       {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
       }



    public static void main(String[] args) {
        int arr[]={2,0,2,2,0,1,1,0};
        System.out.println("The array is:");
        for(int val:arr)
        {
            System.out.print(val+" ");
        }
        System.out.println();
        System.out.println("After applying this theorem");
        threenumberSort(arr);
        for(int val:arr)
        {
            System.out.print(val+" ");
        }
        System.out.println();
    }
    
}
