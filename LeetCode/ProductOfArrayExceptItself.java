package LeetCode;

public class ProductOfArrayExceptItself {
      public static int[] fibdProduct(int[] arr)
      {
        // 1,2,3,4
        int temp=1;
        int result[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            result[i]=temp;
            temp=temp*arr[i];
        }
        temp=1;
        for(int i=arr.length-1;i>=0;i--)
        {
            result[i]=result[i]*temp;
            temp=temp*arr[i];
        }
        return result;
      }




      public static void main(String[] args) {
        int arr[]={1,4,7,12};
        int[] res=fibdProduct(arr);
        for(int n:res)
        {
            System.out.print(n+" ");
        }
      }
}
