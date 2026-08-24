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
        List<List<Integer>> res=new ArrayList<>();

        if(root==null) return res;

        Queue<TreeNode> queue=new LinkedList<>();
            queue.offer(root);
             boolean reverse=false;
        while(!queue.isEmpty())
        {
            List<Integer> sublst=new ArrayList<>();
            int n=queue.size();


            while(n!=0)
            {
                TreeNode node=queue.poll();
                sublst.add(node.val);

                if(node.left!=null) 
                {
                    queue.offer(node.left);
                }
                if(node.right!=null) 
                {
                    queue.offer(node.right);
                }
                n--;
            }
            if(reverse)
            {
            Collections.reverse(sublst);
            }
            res.add(sublst);
            reverse=!reverse;
        }

        return res;
    }
}