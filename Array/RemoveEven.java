public class RemoveEven {


        public int[] removeEven(int a[])
        {
                int oddIndex=0;
                for(int i=0;i<a.length;i++)
                {
                    if(a[i]%2!=0)
                    {
                        oddIndex++;
                    }
                }
                int[] result=new int[oddIndex];
                int idx=0;
                for(int i=0;i<a.length;i++)
                {
                    if(a[i]%2!=0)
                    {
                         result[idx]=a[i];
                         idx++;
                    }
                }
                return result;
        }


        public static void main(String[] args) {
        int a[]={12,8,7,1,9,14,10,5};
        System.out.println("Befor Removing");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("After  Removing even integers");
        RemoveEven RE=new RemoveEven();
        int arr[]=RE.removeEven(a);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
