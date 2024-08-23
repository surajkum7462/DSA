package Hashing;

class Lucky {
    public static int findLucky(int[] arr) {
        int cnt=1;
        int max=0;
        int k;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                cnt++;
                max=arr[i];
               
            }

            else
            {
                continue;
            }
        }
        if(max==cnt)
        {
            return max;
        }
        else
        {
            return -1;
        }
       
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,3};
        int l =findLucky(arr);
        System.out.println(l);
    }
}
