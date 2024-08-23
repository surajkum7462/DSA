public class MissingNumber {

             public static int missingNumber(int arr[])
             {
                int n=arr.length+1;
                int sum=(n*(n+1))/2;
                for(int num:arr)
                {
                    sum=sum-num;
                }

                return sum;
             }
           



    public static void main(String[] args) {
        int a[]={2,4,1,8,6,3,7};
        System.out.println("The number is:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int n=missingNumber(a);
        System.out.println("The Missing number is:"+n);
        

    }
    
}
