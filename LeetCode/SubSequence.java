package LeetCode;

public class SubSequence {


   public static boolean isSubseq(String str , String sub)
   {

    int i=0;
    int j=0;

    while(i < str.length() && j<sub.length())
    {
        if(str.charAt(i)==sub.charAt(j))
        {
            j++;
        }
        i++;
    }

    return j==sub.length();

   }


    public static void main(String[] args) {
        String str="abcde";
        String sub="aec";

        boolean ans=isSubseq(str,sub);
        System.out.println(ans);
    }
    
}
