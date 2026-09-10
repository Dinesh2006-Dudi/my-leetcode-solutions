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
    int cnt=0;
    public int averageOfSubtree(TreeNode root) {
        help(root);
        return cnt;
    }

    public int[] help(TreeNode root)
    {
        if(root==null)
        return new int[]{0,0};
        int[] left=help(root.left);
        int[] right=help(root.right);

        int subtrsum=left[0]+right[0]+root.val;
        int subtrcnt=left[1]+right[1]+1;

        if(subtrsum /subtrcnt==root.val)
        cnt++;

        return new int[]{subtrsum,subtrcnt};
    }
}