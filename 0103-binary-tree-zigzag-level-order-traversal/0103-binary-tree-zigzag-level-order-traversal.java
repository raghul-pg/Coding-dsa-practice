/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int j=1;
        while(!q.isEmpty()){
            List<Integer> inner = new ArrayList<>();
            int n = q.size();
            for(int i=0 ;i<n ;i++){
                TreeNode node = q.poll();
               
                if(j%2 ==0 ){
                    inner.add(0,node.val);
                }
                else{
                    inner.add(node.val);
                }
    
                if(node.left != null){
                    q.offer(node.left);
                }
                if(node.right!= null){
                    q.offer(node.right);
                }
                

            }
            j++;
            res.add(inner);
        }
        return res;
        
    }
}