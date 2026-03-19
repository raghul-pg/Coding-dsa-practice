import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int k = s.nextInt();
       int[] arr = new int[n];
       for(int i=0 ; i<n ; i++){
        arr[i] = s.nextInt();
       }
       HashSet<Integer> hs = new HashSet<>();
       boolean found = false;
       for(int i =0 ; i<n ;i++){
        int n1 = k - arr[i];
        if(hs.contains(n1))
        {
            found = true;
            break;
        }
        hs.add(arr[i]);
       }
       if(found){
        System.out.println("YES");
       }
       else{
        System.out.println("NO");
       }
    }
}
