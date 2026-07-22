package HashMap;

import java.util.HashSet;

public class _349_Intersection_of_Two_Arrays {
    class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        
            for(int u : nums1)
            {
                set.add(u);
            }
            for(int i : nums2)
            {
                if(set.contains(i))
                {
                    result.add(i);
                }
            }
            int[] ans = new int[result.size()];
            
            int i=0;     
            for(int num : result)
            {
            //int i=0;
            ans[i] = num;
            i++;
            }
            return ans;
           


        
    }
}
    
}
