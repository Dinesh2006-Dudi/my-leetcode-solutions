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
    public int countNodes(TreeNode root) {
        if(root==null)
        {
            return 0;
        }

        int lefthgt=0;
        int righthgt=0;

        TreeNode left=root;
        TreeNode right=root;

        while(left!=null)
        {
            lefthgt++;
            left=left.left;
        }

        while(right!=null)
        {
            righthgt++;
            right=right.right;
        }

        if(lefthgt==righthgt)
        {
            return (int) Math.pow(2,lefthgt)-1;
        }

            return 1+countNodes(root.left)+countNodes(root.right);
    }
}