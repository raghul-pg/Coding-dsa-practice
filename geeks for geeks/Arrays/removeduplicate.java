import java.util.*;

class Solution {
    // Function to remove duplicates from the given sorted array
    ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        
        // If the array is empty, just return an empty list
        if (arr.length == 0) return result;
        
        // Add the first element (it’s always unique initially)
        result.add(arr[0]);
        
        // Traverse from the second element onward
        for (int i = 1; i < arr.length; i++) {
            // Only add if the current element is different from the previous
            if (arr[i] != arr[i - 1]) {
                result.add(arr[i]);
            }
        }
        
        return result;
    }
}