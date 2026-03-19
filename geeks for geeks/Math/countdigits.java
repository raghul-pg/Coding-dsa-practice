class Solution {
    public static int evenlyDivides(int N) {
        int count = 0;
        int temp = N; // copy of N

        while (temp > 0) {
            int digit = temp % 10;  // extract digit
            if (digit != 0 && N % digit == 0) {
                count++;
            }
            temp /= 10; // move to next digit
        }

        return count;
    }
}