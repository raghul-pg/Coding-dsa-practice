class Solution {
    static boolean isPrime(int n) {
        // 1 is not prime
        if (n <= 1) return false;
        // 2 and 3 are prime
        if (n <= 3) return true;
        // multiples of 2 or 3 are not prime
        if (n % 2 == 0 || n % 3 == 0) return false;

        // check for divisors from 5 to sqrt(n), skipping even numbers
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(7));   // true
        System.out.println(isPrime(25));  // false
        System.out.println(isPrime(1));   // false
    }
}