package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int nums[] , int target)
    {
        int[] result=new int[2];
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target-nums[i]))
            {
               map.put(nums[i],i);
            }
            else{
                result[1]=i;
               result[0]= map.get(target-nums[i]);
               return result;
        }
        }
       throw new IllegalArgumentException("The numbers is not fonud");
    }

    public static void main(String[] args) {
        int arr[]=new int[]{2,11,5,10,7,25};

        System.out.println("Your array is:");
        
        for(int r:arr)
        {
            System.out.print(r+" ");
        }
        int[] result=twoSum(arr, 9);

        System.out.println("THe indexes are:");
        for(int a:result)
        {
            System.out.print(a+" ");
        }
    }
    
}
