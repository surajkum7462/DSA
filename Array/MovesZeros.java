public class MovesZeros {




    public static void movesZeros(int a[])
    {
        int j=0; //Focus on zeroth element
        for(int i=0;i<a.length;i++) //i-->focus on non-zeroth element
        {
            if(a[i]!=0 && a[j]==0)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            if(a[j]!=0)
            {
                j++;
            }
        }
    }

     public static void printArray(int a[])
     {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
     }





    public static void main(String[] args) {
        int a[]={8,0,0,2,1,0,3,16,9,0,2,78,0};
        System.out.println("The array of elemnts is:");
        printArray(a);
        System.out.println();
        movesZeros(a);
        printArray(a);
    }
    
}
