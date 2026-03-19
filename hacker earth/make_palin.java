import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- >0){
            int n = s.nextInt();
            String s1 = s.next();
            int freq[] = new int[26];
            for(char c : s1.toCharArray()){
                freq[c - 'a']++;

            }
            int odd = 0;
            for(int f : freq){
                if(f%2 != 0){
                    odd++;
                }
            }
            int cost = Math.max(0,odd-1);
            System.out.println(cost);
        }
    }
}
