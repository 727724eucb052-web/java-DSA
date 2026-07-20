package Strings;

public class _389_Find_the_Difference {
    
    public char findTheDifference(String s, String t) {
        int n=s.length();
        int[] freq = new int[600];
        char new_ch='a';
        for(int i=0;i<n;i++)
        {
           char ch = s.charAt(i);
           freq[ch - 'a']++;

        }
        for(int i=0;i<=n;i++)
        {
           char ch =t.charAt(i);
           if(freq[ch-'a']==0  )
           {
             new_ch = ch;
             break;
           }
           else
           
           {
            freq[ch-'a']--;
           }
                       
             
        }
        return new_ch;
    }
}
    
