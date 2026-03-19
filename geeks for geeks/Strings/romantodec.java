class Solution {
    public int romanToDecimal(String s) {
        // code here
        
       
        
        int tot = 0;
        for( int i=0 ; i < s.length() ; i++)
        {
            int ch = val(s.charAt(i));
             
            if( i+1 < s.length() && ch < val(s.charAt(i+1)))
            {
                tot-=ch;
            }
            else 
            {
                tot += ch;
            }
        }
        return tot;
    }
     static int val(char ch)
        {
            if(ch == 'I') return 1;
            if(ch == 'V') return 5;
            if(ch == 'X') return 10;
            if(ch == 'L') return 50;
            if(ch == 'C') return 100;
            if(ch == 'D') return 500;
            if(ch == 'M') return 1000;
            return 0;
            
            
        }
}