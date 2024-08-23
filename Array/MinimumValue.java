public class MinimumValue {
    
        public static void minimumValue(int a[])
        {
            int min=a[0];
            for(int i=1;i<a.length;i++)
            {
                if(a[i]<min)
                {
                    min=a[i];
                }
            }
            System.out.println(min);
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
        int a[]={2,8,10,11,1,16,33,55,45,89,1};
        System.out.println("The elements of array is:");
        printArray(a);
        System.out.println("The minimum value of array is:");
        minimumValue(a);
    }
}
