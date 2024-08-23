class CheckTimeComplexity
{
    public static void main(String[] args) {
        double now=System.currentTimeMillis();
        CheckTimeComplexity demo=new CheckTimeComplexity();
        
        System.out.println(demo.findSum(99999));
       
        System.out.println("Time taken:"+(System.currentTimeMillis()-now)+" Millisec");


       
    }
    // public int findSum(int n)
    // {
    //     return (n*(n+1))/2;
    // }
     public int findSum(int n)
     {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        return sum;
     }


}