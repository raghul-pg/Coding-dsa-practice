import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int n = s.nextInt();
        for(int i =0 ; i< n; i++){
            int w = s.nextInt();
            int h = s.nextInt();
            if(w<l || h<l){
                System.out.println("UPLOAD ANOTHER");

            }
            else if(w==h){
                System.out.println("ACCEPTED");
            }
            else{
                System.out.println("CROP IT");
            }
        }
    }
}
