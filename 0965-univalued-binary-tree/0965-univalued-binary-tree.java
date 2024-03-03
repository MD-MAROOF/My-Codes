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
    public boolean isUnivalTree(TreeNode root) {
        
        int uni_value = root.val;
        Queue<TreeNode> queue = new LinkedList<>();
        
        
        queue.offer(root);
        while(!queue.isEmpty())
        {
            TreeNode node = queue.poll();
            
            if(node.val != uni_value)
                return false;
            
            if(node.left != null)
                queue.add(node.left);
            
            if(node.right != null)
                queue.add(node.right);
        }
        
        return true;
    }
}