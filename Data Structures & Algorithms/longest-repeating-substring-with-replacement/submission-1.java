class Solution {
    public int characterReplacement(String s, int k) {

        int l=0;
        int len =0;
        int max = 0;
        int [] countArr = new int[26];
        for (int r = 0; r<s.length();r++)
        {

            countArr [s.charAt(r) - 'A']++;
            max = Math.max(max,countArr[s.charAt(r)- 'A']);
            if(r-l+1 - max >k)
            {
               
                countArr[s.charAt(l)-'A']--;
                 l++;
            }
            len = Math.max(len,r-l+1);

            
        }
        return len;
        
    }
}
