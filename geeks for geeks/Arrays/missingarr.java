class Solution {
    int missingNum(int arr[]) {
        int n = arr.length + 1; // Total numbers including the missing one
        long totalSum = (long)n * (n + 1) / 2; // Use long to avoid overflow
        long arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }
        return (int)(totalSum - arrSum); // Missing number
    }
}