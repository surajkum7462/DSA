package stack1;

public class NextGreaterElement {


    public static void main(String[] args) {
        int a[]={4,7,3,4,8,1};
        int b[]=new int[a.length];
       int k=0;
        for(int i=0;i<a.length;i++)
        {
            int temp=-1;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]>a[i])
                {
                    temp=a[j];
                    break;
                }

            }
            if(temp!=-1)
            {
                b[k]=temp;
                k++;
            }
            else
            {
                b[k]=-1;
                k++;
            }
            
        }
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }
        
    }
    
}
