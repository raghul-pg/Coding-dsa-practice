import java.util.Arrays;

class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        if (a.length != b.length) return false; // Different lengths

        Arrays.sort(a);
        Arrays.sort(b);

        // Compare elements one by one
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }

        return true; // All elements matched
    }
}