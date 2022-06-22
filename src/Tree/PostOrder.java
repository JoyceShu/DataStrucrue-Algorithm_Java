package Tree;


import java.util.ArrayList;


public class PostOrder {
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
        traverse(root.right, result);
        result.add(root.val);
    }

}
