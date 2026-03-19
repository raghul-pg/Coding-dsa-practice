class Solution {
    public int getLastDigit(String a, String b) {
        // If exponent is "0", result is always 1
        if (b.equals("0")) return 1;

        // Get last digit of base
        int lastDigit = (a.charAt(a.length() - 1) - '0');

        // Find b % 4 (since last digit cycles every 4)
        int mod = 0;
        for (int i = 0; i < b.length(); i++) {
            mod = (mod * 10 + (b.charAt(i) - '0')) % 4;
        }
        if (mod == 0) mod = 4;  // full cycle

        // Compute last digit using modular exponentiation
        int result = (int) Math.pow(lastDigit, mod) % 10;

        return result;
    }
}