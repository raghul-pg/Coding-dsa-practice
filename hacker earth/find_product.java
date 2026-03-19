import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        long product = 1;
        long mod = 1000000007;
        
        for(int i = 0 ; i < n ; i++){
            product = (product * Long.parseLong(arr[i]))%mod;
        }
        System.out.println(product);
    
    }
}
