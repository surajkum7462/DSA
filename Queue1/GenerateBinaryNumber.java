package Queue1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;;

public class GenerateBinaryNumber {



    public static String[] generateBinary(int n)
    {
        String[] result=new String[n];
        Queue<String> q=new LinkedList<>();
        q.offer("1");
        for(int i=0;i<n;i++)
        {
            result[i]=q.poll();
            String n1=result[i]+"0";
            String n2=result[i]+"1";
            q.offer(n1);
            q.offer(n2);

            
        }
        return result;







    }
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number you want to genearte binary number:");
    int n=sc.nextInt();
    String[] result =generateBinary(n);
    System.out.println("The generated binary number is:");
    for(int i=0;i<result.length;i++)
    {
        System.out.println(i+1+"-->"+result[i]);
    }


    }
    
}
