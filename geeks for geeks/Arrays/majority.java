import java.util.Arrays;
class Solution {
    int majorityElement(int arr[]) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        int cand_key=arr[n/2];
        int c=0;
        for(int n1:arr)
        {
            if(n1==cand_key)
            {
                c++;
            }
            
        }
        if(c>n/2)
        {
            return cand_key;
        }
        return -1;
        
        
    }
}