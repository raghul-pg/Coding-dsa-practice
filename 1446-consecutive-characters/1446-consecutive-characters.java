class Solution {
    public int maxPower(String s) {
        char[] c = s.toCharArray();
        int count=1;
        int max=0;
        if(s.length()==1){
            return 1;
        }
        for(int i=1; i<s.length();i++){
            if(c[i] == c[i-1]){
                count++;

            }
            else{
                count=1;
            }
            if(count > max)
            {
                max=count;
            }

        }
        return max;
    }
}