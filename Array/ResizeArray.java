public class ResizeArray {
       


    public static int[] resizeArray(int a[],int capacity)
    {
        int[] temp=new int[capacity];
        for (int i=0;i<a.length;i++)
        {
            temp[i]=a[i];

        }
        a=temp;
        return a;
    }
            

    public static void printArray(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }




    public static void main(String[] args) {
        int a[]={5,9,3,8};
        System.out.println("Your elements of array is:");
        printArray(a);
        System.out.println("the length of original array is:"+a.length);
        int arr[]=resizeArray(a,(a.length)*2);
        System.out.println("After resizing the array");
        printArray(arr);
        System.out.println("After resizing the length of original array is:"+arr.length);
    }
    
}
