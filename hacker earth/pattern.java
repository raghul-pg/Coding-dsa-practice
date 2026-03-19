import java.util.*;

class TestClass {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                
                int val = Math.max(Math.abs(i - r), Math.abs(j - c));
                
                System.out.print(val + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}