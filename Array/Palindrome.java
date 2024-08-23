import java.util.Scanner;
public class Palindrome {
        public static boolean Ispalindrome(String word)
        {
            char[] charWord=word.toCharArray();
            int start=0;
            int end=word.length()-1;
            while(start<end)
            {
                if(charWord[start]!=charWord[end])
                {
                   return false;
                }
                start++;
                end--;
            }
            return true;
        }



    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any String:");
        String str=sc.nextLine();
       if(Ispalindrome(str))
       {
        System.out.println("The String is palindrome");
       }
       else
       {
        System.out.println("The String is not palindrome");
       }
    }
}
