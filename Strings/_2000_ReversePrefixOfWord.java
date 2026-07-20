package Strings;

public class _2000_ReversePrefixOfWord {
    public String reversePrefix(String word, char ch) {
        int n = word.length();
        char[] arr =word. toCharArray();
        for(int i=0;i<n;i++)
        {
            if(word.charAt(i)== ch)
            {
                int left=0;
                int right=i;
                while(left < right)
                {
                    char temp = arr[left];
                    arr[left]  =arr[right];
                    arr[right] = temp;

                    left++;
                    right--;
                }break;
            }
        }
        String atr =  new String(arr);
        return atr;
    }
}

    

