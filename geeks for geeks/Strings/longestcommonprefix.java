// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        if(arr == null || arr.length ==0) return "";
        
        String pref = arr[0];
        
        for (int i= 1 ; i < arr.length ; i++)
        {
            while (!arr[i].startsWith(pref))
            {
                pref = pref.substring(0 , pref.length()-1);
                if(pref.isEmpty())  return "";
            }
        }
        return pref;
    }
}