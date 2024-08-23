public class SecondMaxValue {

       public static void secondMaxElement(int a[])
       {
        int secondMax=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;
        
         for(int i=0;i<a.length;i++)
         {
            if(a[i]>max)
            {
                secondMax=max;
                max=a[i];
            }
            else if(a[i]>secondMax && a[i]!=max)
            {
                secondMax=a[i];
            }
         }
         System.out.println(secondMax);
       }



      public static void printArray(int a[])
      {
        for (int i = 0; i < a.length; i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println();
      }







    public static void main(String[] args) {
        int a[]={2,90,78,12,55,76};
        System.out.println("The elements of array is:");
        printArray(a);
        System.out.println("The second Maximum element of array is:");
        secondMaxElement(a);
    }
}
