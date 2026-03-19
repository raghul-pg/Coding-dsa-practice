class Solution {
    boolean armstrongNumber(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }
        return sum == original;
    }
    public static void main(String[] args) {
        Solution ob = new Solution();
        int n = 153;
        boolean flag = ob.armstrongNumber(n); // Now this works
        System.out.println(flag); // true
    }
}