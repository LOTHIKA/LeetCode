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
    public boolean isValidBST(TreeNode root){
    List<Integer> ls=new ArrayList<>();

    inOrderTraversal(root, ls);


    for(int i=1;i<ls.size();i++){
      if(ls.get(i)<=ls.get(i-1))
      return false;
         
    }

         return true;
    }

  void inOrderTraversal(TreeNode root,   List<Integer> ls){

   if(root==null) return;


    //    LEFT / ROOT / RIGHT

    inOrderTraversal(root.left, ls);
    ls.add(root.val);
    inOrderTraversal(root.right, ls);
}
}