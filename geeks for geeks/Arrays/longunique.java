class Solution {
    public int longestUniqueSubstr(String s) {
        int[] frq = new int[26];
        int left = 0, maxLen = 0;
         
         for( int right =0 ; right < s.length() ; right++)
         {
             char ch = s.charAt(right);
             frq[ ch - 'a' ]++;
             
             while(frq[ch-'a'] > 1)
             {
                 frq[s.charAt(left)-'a']--;
                 left++;
             }
             
             maxLen = Math.max(maxLen , right-left + 1);
         }
         
         return maxLen;
        
    }
}