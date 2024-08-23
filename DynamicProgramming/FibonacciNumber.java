package DynamicProgramming;

import java.util.Scanner;

// ButtomUp approach

public class FibonacciNumber {


    public static int[] fibo(int n)
    {
        int table[]=new int[n+1];

        table[0]=0;
        table[1]=1;

        for(int i=2;i<=n;i++)
        {
            table[i]=table[i-1]+table[i-2];
        }
        return table;
    }

    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();

        int ans[]=fibo(n);
       for(int i:ans)
       {
        System.out.print(i+" ");
       }
    }
    
}
