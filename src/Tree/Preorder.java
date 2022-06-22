package Tree;


import com.sun.source.tree.Tree;

import java.util.ArrayList;



public class Preorder {
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
        result.add(root.val);
        //divide problem
        traverse(root.left, result);
        traverse(root.right, result);
    }

}
