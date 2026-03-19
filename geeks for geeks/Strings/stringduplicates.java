// User function Template for Java

class Solution {
    String removeDuplicates(String s) {
        Set<Character> seen = new HashSet<>() ;
        StringBuilder res = new StringBuilder();
        
        for(int i=0 ; i<s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(!seen.contains(ch))
            {
                seen.add(ch);
                res.append(ch);
            }
        }
        return res.toString();
    }
}
