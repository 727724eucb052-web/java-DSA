package Arrays;

public class _1480_RunningSumof1DArray
 {
    
    public int[] runningSum(int[] nums)
    {
        int sum=0;
        int n=nums.length;
        int[] running = new int[n];
        for(int i=0;i<n;i++)
        {
            sum += nums[i];
            running[i] = sum;
        }

    return running ;
    }
}
    

