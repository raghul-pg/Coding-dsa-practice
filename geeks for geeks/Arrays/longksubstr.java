class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int[] count = new int[26];
        int left =0 , dis =0, maxLen = -1 ;
        
        for (int right =0 ; right < s.length() ; right++)
        {
            if(count[s.charAt(right) - 'a'] ==0)
            {
                dis++ ;
            }
            count[s.charAt(right) - 'a']++;
            
            while(dis > k)
            {
                count[s.charAt(left) - 'a']--;
                if(count[s.charAt(left) - 'a'] == 0)
                {
                    dis--;
                }
                left++;
            }
            if(dis == k)
            {
                maxLen = Math.max(maxLen , right-left+1);
            }
        }
        return maxLen;
    }
}