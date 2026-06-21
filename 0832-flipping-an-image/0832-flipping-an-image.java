class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n1= image.length;
        int n2 = image[0].length;
        int[][] res = new int[n1][n2];
        for(int i=0;i<n1;i++){
            int index=0;
            for(int j=n2-1;j>=0;j--){
                
                res[i][index] =image[i][j];
                index++;
            }
        }
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(res[i][j]==0){
                    res[i][j]=1;
                }
                else{
                    res[i][j] =0;
                }
            }
        }
        return res;
        
    }
}