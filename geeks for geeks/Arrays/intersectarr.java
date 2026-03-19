import java.util.*;

class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Store all elements of first array in a HashSet
        HashSet<Integer> setA = new HashSet<>();
        for (int num : a) {
            setA.add(num);
        }

        int count = 0;
        // Check each element of b[] in setA
        for (int num : b) {
            if (setA.contains(num)) {
                count++;
                // Remove to avoid double counting (though arrays are distinct)
                setA.remove(num);
            }
        }

        return count;
    }
}