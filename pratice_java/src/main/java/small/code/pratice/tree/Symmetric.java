package small.code.pratice.tree;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Symmetric Tree
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * 
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 * 
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * 
 *  
 * 
 * But the following [1,2,2,null,3,null,3] is not:
 * 
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 * 
 *  
 * 
 * Follow up: Solve it both recursively and iteratively.
 *
 */
public class Symmetric {
    public boolean isSymmetric(TreeNode root) {
		Deque<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		queue.add(root);
        while(!queue.isEmpty()) {
        	TreeNode root1 = queue.pollFirst();
        	TreeNode root2 = queue.pollFirst();
            if(root1 == null && root2 == null){
                continue;
            }
        	if((root1 == null || root2 == null)  ||
        			(root1.val != root2.val)) {
        		return false;
        	}
        	queue.add(root1.left);
	        queue.add(root2.right);
	        queue.add(root1.right);
	        queue.add(root2.left);
        }
        
        return true;
    }
	
    public boolean isSymmetric1(TreeNode root) {
        return isSymmetric(root, root);
    }
    
    private boolean isSymmetric(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) {
        	return true;
        } 
        if(root1 == null || root2 == null) {
        	return false;
        }
        
        return root1.val == root2.val &&
        		isSymmetric(root1.left, root2.right) && 
        		isSymmetric(root1.right, root2.left);
    }
}
