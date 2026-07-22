package HashMap;

public class _383_Ransom_Note {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n = magazine.length();
        int m = ransomNote.length();

        int[]  freq = new int[26];
        //int[]  freq2 = new int[26];
        for(int i=0;i<n;i++)
        {
            char ch = magazine.charAt(i);
            freq[ch - 'a']++;
        }
        for(int i=0;i<m;i++)
        {
            char ch = ransomNote.charAt(i);
            freq[ch - 'a']--;
        
        if(freq[ch - 'a' ] < 0)
        {
            return false;
        }
        }
        return true;
        
    }
}
    

