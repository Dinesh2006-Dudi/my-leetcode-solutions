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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res=new ArrayList<>();
        Queue<TreeNode> queue= new LinkedList<>();

         if(root ==null) return res;

         queue.offer(root);

        

         while(!queue.isEmpty())
         {
                double sum=0;
                 int n=queue.size();

                for(int i=0;i<n;i++)
                {
                    TreeNode node=queue.poll();
                    sum+=node.val;

                    if(node.left!=null) queue.offer(node.left);
                    if(node.right!=null) queue.offer(node.right);
                }
                
                res.add(sum/n);
                
         }
         return res;

    }
}