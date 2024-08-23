package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeat {

       
    public static int firstNonRepeatingChar(String str)
    {

        char[] chars=str.toCharArray();
        Map<Character , Integer> map=new HashMap<>();
        for(char ch:chars)
        {
            map.put(ch,map.getOrDefault(ch, 0)+ 1);
        }

        for(int i=0;i<chars.length;i++)
        {
            char ch=chars[i];
            if(map.get(ch)==1)
            {
                return i;
            }
        }
        return -1;
        
    }


    public static void main(String[] args) {
        String str="racecars";
        String str1="abab";

        int ans=firstNonRepeatingChar(str);
        int ans1=firstNonRepeatingChar(str1);
        System.out.println("The index is:"+ans);
        System.out.println("The index is:"+ans1);
    }
    
}
