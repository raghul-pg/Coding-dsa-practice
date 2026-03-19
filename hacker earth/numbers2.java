import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    static long gcd(long a , long b){
        while(b!=0){
            long temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- >0){
            long a= s.nextInt();
            long b = s.nextInt();
            long n = s.nextInt();
            long gcd = gcd(a,b);
            long lcm = (a * b ) /gcd;
            long low = 1;
            long high = 10000000000000L;
            long ans =0;
            while(low <= high){
                long mid = (low+high)/2;
                long count = (mid/a) + (mid/b) - (mid/lcm);
                if(count>=n){
                    ans = mid;
                    high = mid -1;
                }
                else{
                    low = mid + 1;
                }
            }
            System.out.println(ans);
        }
        
    }
}
