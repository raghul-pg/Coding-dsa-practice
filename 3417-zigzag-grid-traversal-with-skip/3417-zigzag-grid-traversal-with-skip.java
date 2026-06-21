class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> res = new ArrayList<>();
        int n = grid.length;
        int m = grid[0].length;
        int i=0;
        boolean flag=true;
        boolean skip = false;
        while(i<n){
            if(flag){
                for(int j=0;j<m;j++){
                    if(!skip){
                        res.add(grid[i][j]);
                    }
                    skip = !skip;
                }
            }
            else{
                for(int j=m-1;j>=0;j--){
                    if(!skip){
                        res.add(grid[i][j]);
                    }
                    skip = !skip;
                }
            }
            flag= !flag;
            i++;
        }
        return res;
        
    }
}