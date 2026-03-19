import java.util.Arrays;

class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        Arrays.sort(arr); // Step 1: sort the array

        int n = arr.length;
        for (int i = 0; i < n - 2; i++) { // fix the first element
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == target) {
                    return true; // triplet found
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return false; // no triplet found
    }
}