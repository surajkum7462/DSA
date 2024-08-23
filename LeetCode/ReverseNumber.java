package LeetCode;

public class ReverseNumber {

       

    public static long reverseNumber(long n)
    {
        boolean isNagative=n<0;
        if(isNagative)
        {
            n=n* -1;
        }
        long r;
      long sum=0;

        while(n!=0)
        {
           r = n%10;
           sum=sum*10+r;
           n=n/10;

        }
        return isNagative ? sum * -1:sum;
    }


    public static void main(String[] args) {
       long n =-1234;

        System.out.println("Your Value is:"+n);

        long res=reverseNumber(n);
        System.out.println("The reverse is:"+res);
    }
    
}
