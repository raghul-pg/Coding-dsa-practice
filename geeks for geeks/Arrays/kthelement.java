class Solution {
    public int kthElement(int a[], int b[], int k) {
        int n = a.length, m = b.length;
        int i = 0, j = 0; // pointers for a[] and b[]
        int count = 0, result = -1;

        // Traverse until we find the kth element
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                result = a[i];
                i++;
            } else {
                result = b[j];
                j++;
            }
            count++;

            // When we reach k elements
            if (count == k) return result;
        }

        // If elements are still left in a[]
        while (i < n) {
            result = a[i];
            i++;
            count++;
            if (count == k) return result;
        }

        // If elements are still left in b[]
        while (j < m) {
            result = b[j];
            j++;
            count++;
            if (count == k) return result;
        }

        return result; // should never reach here
    }
}