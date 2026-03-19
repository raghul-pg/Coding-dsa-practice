import java.util.*;

class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        
        ArrayList<Integer> res = new ArrayList<>();
        
        int n = mat.length;
        int m = mat[0].length;
        
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;
        
        while(top <= bottom && left <= right){
            
            // Left -> Right
            for(int i = left; i <= right; i++){
                res.add(mat[top][i]);
            }
            top++;
            
            // Top -> Bottom
            for(int i = top; i <= bottom; i++){
                res.add(mat[i][right]);
            }
            right--;
            
            if(top <= bottom){
                // Right -> Left
                for(int i = right; i >= left; i--){
                    res.add(mat[bottom][i]);
                }
                bottom--;
            }
            
            if(left <= right){
                // Bottom -> Top
                for(int i = bottom; i >= top; i--){
                    res.add(mat[i][left]);
                }
                left++;
            }
        }
        
        return res;
    }
}