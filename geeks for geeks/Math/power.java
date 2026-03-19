class Solution {
    public int reverseExponentiation(int n) {
        int rev = 0;
        int temp = n;
        
        // Step 1: Reverse the number
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        
        // Step 2: Compute n raised to the power of its reverse
        int result = (int) Math.pow(n, rev);
        
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.reverseExponentiation(2));  // Output: 4
        System.out.println(sol.reverseExponentiation(10)); // Output: 10
    }
}