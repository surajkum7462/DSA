package Graph;

class ex {
    public static int[] addToArrayForm(int[] nums, int k) {

        int sum=0;
        int[] arr=new int[nums.length];
        if(nums.length==3)
        {
           sum+= nums[0]*100;
            sum+=nums[1]*10;
            sum+=nums[2];
        }
        else
        {
            sum+= nums[0]*1000;
            sum+=nums[1]*100;
            sum+=nums[2]*10;
            sum+=nums[3];
        }
        sum+=k;
        int i=0;
        System.out.println(sum);
        while(sum!=0)
        {
            int r=sum%10;
            arr[i]=r;
            i++;
            sum=sum/10;
        }
        int[] result=new int[arr.length];
        int j=0;
        for(int c=arr.length-1;c>=0;c--)
        {
            result[j]=arr[c];
            j++;
        }
        return result;
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,0,0};
        int k=34;
        int res[]=addToArrayForm(arr,k);
        System.out.println();
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}