package Tree;


import java.util.ArrayList;

class TreeNode {
     public int val;
     public TreeNode left, right;
     public TreeNode(int val) {
         this.val = val;
         this.left = this.right = null;
      }
  }

public class Inorder {
    public ArrayList<Integer> preorderTraversal(TreeNode root){
        ArrayList<Integer> result = new ArrayList<Integer>();
        traverse(root, result);
        return  result;
    }

    private void traverse(TreeNode root, ArrayList<Integer> result){
        //recursion end case
        if (root == null){
            return;
        }
        //single function logic
        //divide problem
        traverse(root.left, result);
        result.add(root.val);
        traverse(root.right, result);
    }

}
