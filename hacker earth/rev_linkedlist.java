import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(s[i]);
        }

        int i = 0;

        while(i < n){

            if(arr[i] % 2 == 0){

                int start = i;

                while(i < n && arr[i] % 2 == 0){
                    i++;
                }

                int end = i - 1;

                while(start < end){
                    int temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;
                }
            }
            else{
                i++;
            }
        }

        for(i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}