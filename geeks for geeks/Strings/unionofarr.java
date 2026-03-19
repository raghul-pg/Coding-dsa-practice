import java.util.*;

class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // Use a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();

        // Add all elements from array a
        for (int num : a) {
            set.add(num);
        }

        // Add all elements from array b
        for (int num : b) {
            set.add(num);
        }

        // Convert the set to a list
        ArrayList<Integer> result = new ArrayList<>(set);

        // Sort the result since the driver will print in sorted order
        Collections.sort(result);

        return result;
    }
}