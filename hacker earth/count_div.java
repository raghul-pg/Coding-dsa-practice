import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int r = s.nextInt();
        int k = s.nextInt();
        int count = 0;
        for(int i=l;i<=r ;i++ ){
            if(i % k == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
