class Solution {
    public int countPrimeSetBits(int left, int right) {
        int c=0;
        for(int i=left ; i<=right ; i++)
        {
            int b = Integer.bitCount(i);
            if(prime_check(b)){
                c++;
            }

        }
        return c;
        
    }
    static boolean prime_check(int n)
    {
        return (n==2 || n==3 ||n==5 ||n==7 ||n==11 ||n==13 ||n==17 ||n==19);
    }
}