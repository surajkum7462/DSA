package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ThreeSum {


    public static void threeSum(int arr[] ,int target)
    {
         for(int i=0;i<arr.length;i++)
         {
            Arrays.sort(arr);
            int j=i+1;
            int k=arr.length-1;

            while(j < k)
            {
              int sum=arr[i]+arr[j]+arr[k];
              if(sum==target)
              {
                System.out.print(arr[i]+","+arr[j]+","+arr[k]);
                System.out.println();
                j++;
                k--;
              }
              else if(sum<target)
              {
                j++;
              }
              else
              {
                k--;
              }

            }
         }
    }
    public static void main(String[] args) {
        int a[]={4,3,2,1,7,0};
        threeSum(a, 6);
    }
    
}
