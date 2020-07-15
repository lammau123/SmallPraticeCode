package small.code.pratice.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Binary Tree Preorder Traversal
 * 
 * Given a binary tree, return the preorder traversal of its nodes' values.
 * 
 * Example:
 * 
 * Input: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 * 
 * Output: [1,2,3]
 * 
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 *
 */
public class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> rs = new ArrayList<Integer>();
        traversal(root, rs);
        return rs;
    }
    
    private void traversal(TreeNode root, List<Integer> rs) {
    	if(root != null) {
    		rs.add(root.val);
    		traversal(root.left, rs);
    		traversal(root.right, rs);
    	}
    }
}
