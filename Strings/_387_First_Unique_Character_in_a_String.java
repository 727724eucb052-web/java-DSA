package Strings;

public class _387_First_Unique_Character_in_a_String {
    
    public int firstUniqChar(String s) {
        int[] freq  = new int[26];
       int n=s.length();
       int y=0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        for(int i=0;i<n;i++)
        {
           char ch = s.charAt(i) ;
           if(freq[ch-'a'] ==1)
           {
           y=i;
           break;
           }
           else 
{
    y=-1;
}
        }return y;
    }
}
    

