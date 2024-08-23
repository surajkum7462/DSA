package Sorting;

public class mergetwoarr {
    

      public static int[] mergeArray(int arr1[],int arr2[])
      {
          int n=arr1.length;
          int m=arr2.length;
          int[] result=new int[n+m];
          int i=0;int j=0;
          int k=0;
          while(i<n && j<m)
          {
            if(arr1[i]<arr2[j])
            {
                result[k]=arr1[i];
                i++;
               

            }
            else
            {
                result[k]=arr2[j];
                j++;
               
            }
            k++;
          }
          while(i<n)
          {
            result[k]=arr1[i];
                i++;
                k++;
          }
          while(j<m)
          {
            result[k]=arr2[j];
                j++;
                k++;
          }
        return  result;
      }




    public static void main(String[] args) {
       int arr1[]={2,3,5,10,33,44,55};

       int arr2[]={4,6,11,15};


       System.out.println("The elements of first array");
       for(int a:arr1)
       {
        System.out.print(a+" ");
       }
       System.out.println();
       System.out.println("THe elements of second array");
       for(int a:arr2)
       {
        System.out.print(a+" ");
       }
       System.out.println();
       System.out.println("After merging this sorted array ");
       int arr[]=mergeArray(arr1,arr2);
       for(int a:arr)
       {
        System.out.print(a+" ");
       }
    }
}
