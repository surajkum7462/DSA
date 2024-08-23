package Hashing;

class Solution {
    public static boolean increasingTriplet(int[] nums) {
        int l=0;
        int r=nums.length-2;

        while(l< r)
        {
            if(nums[l]<nums[l+1] && nums[l+1]<nums[l+2])
            {
                return true;
            }
            else
            {
                l++;
                
            }
            continue;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={20,100,10,12,5,13};
        boolean bool =increasingTriplet(arr);
        System.out.println(bool);
    }
}
