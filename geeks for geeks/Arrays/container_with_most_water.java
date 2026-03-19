class Solution {
    public int maxWater(int arr[]) {
        
        // Code Here
        int left = 0;
        int right = arr.length - 1;
        int maxArea = 0;
        
        while (left < right)
        {
            int ht = Math.min(arr[left], arr[right]);
            int width = right - left;
            int area = ht * width;
            
            maxArea = Math.max(maxArea , area);
            
            if (arr[left] < arr[right])
            {
                left++;
            }
            
            else 
            {
                right--;
            }
        }
        return maxArea;
        
        
    }
}