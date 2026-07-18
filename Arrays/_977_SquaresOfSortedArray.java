package Arrays;

import java.util.Arrays;

public class _977_SquaresOfSortedArray
 {
    
    public int[] sortedSquares(int[] nums) 
    {
        int n = nums.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
           arr[i] = nums[i] * nums[i] ;
        }
      Arrays.sort(arr);
       
       return arr; 
    }

    
}
