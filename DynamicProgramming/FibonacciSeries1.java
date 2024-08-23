package DynamicProgramming;

//Top Down Approach

public class FibonacciSeries1 {

    public static int fibo(int memo[],int n)
    {
        if(memo[n]==0)
        {
            if(n < 2)
            {
                memo[n]=n; // 0 and 1
            }
            else
            {
                int left=fibo(memo, n-1);
                int right=fibo(memo,n-2);
                return left+right;
            }
        }
        return memo[n];
    }
    public static void main(String[] args) {
        System.out.println("The 6th Fibonacci Number is:"+fibo(new int[7], 6));
    }
    
}
