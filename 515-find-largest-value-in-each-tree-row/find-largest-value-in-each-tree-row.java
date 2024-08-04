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
    public List<Integer> largestValues(TreeNode root) {

     List<Integer> ls=new ArrayList<>();
     if(root==null) return ls; 
      
     Queue<TreeNode> queue=new LinkedList<>();

     queue.add(root);

     while(queue.size()>0){
     int sizeOfCurrentLevel = queue.size();
    
      int max = Integer.MIN_VALUE;
     for(int i=0;i<sizeOfCurrentLevel;i++){
     
        TreeNode popped = queue.poll();
        max = Math.max(max, popped.val);

        if(popped.left!=null)
        queue.add(popped.left);
        
           if(popped.right!=null)
        queue.add(popped.right);

     }

     ls.add(max);

     }

return ls;

    }
}