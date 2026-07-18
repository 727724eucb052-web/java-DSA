package Arrays;

public class _283_MoveZeroes {
    public void moveZeroes(int[] nums) {
       int n  = nums.length;
       for(int i=0,j=0;i<n;i++)
       {
        if(nums[i] != 0)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j++;
        }
       }
       
        
        
    }
}
    

