package small.code.pratice.tree;

/**
 * Path Sum
 * 
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 * 
 * Note: A leaf is a node with no children.
 * 
 * Example:
 * 
 * Given the below binary tree and sum = 22,
 * 
 *       5
 *      / \
 *     4   8
 *    /   / \
 *   11  13  4
 *  /  \      \
 * 7    2      1
 * 
 * return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 *
 */
public class HasPathSum {
	public boolean hasPathSum(TreeNode root, int sum) {
        return hasPathSum(root, sum, 0);
    }
    
    private boolean hasPathSum(TreeNode root, int sum, int count) {
    	if(root != null) {
            count += root.val;
    		return ((count == sum && root.left == null && root.right == null) || 
                    hasPathSum(root.left, sum, count) || 
    					hasPathSum(root.right, sum, count));
    	}
    	
    	return false;
    }
}
