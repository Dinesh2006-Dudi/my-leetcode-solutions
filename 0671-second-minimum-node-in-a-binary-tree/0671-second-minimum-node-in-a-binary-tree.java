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
    public int findSecondMinimumValue(TreeNode root) {
        
        return dfs(root,root.val);
    }
        public int dfs(TreeNode root, int firstmin)
        {
            if(root==null)
            {
                return -1;
            }

            if(root.val>firstmin)
            {
                return root.val;
            }

            int leftval=dfs(root.left,firstmin);
            int rightval=dfs(root.right,firstmin);

            if(leftval!=-1 && rightval!=-1)
            {
                return Math.min(leftval,rightval);
            }
            return leftval!=-1? leftval:rightval;
        }
    }
