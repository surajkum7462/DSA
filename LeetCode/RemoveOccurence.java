package LeetCode;

public class RemoveOccurence {



    public static int removeElements(int[] nums ,int val)
    {
        int i=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=val)
            {
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }


    public static void main(String[] args) {
        int[] n={0,0,1,1,1,2,2,3,3,4};

      int res =  removeElements(n,3);
      System.out.println(res);
    }
    
}
