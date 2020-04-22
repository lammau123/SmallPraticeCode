package small.code.pratice.array;

/**
 * 
 * Construct Binary Search Tree from Preorder Traversal
 * 
 * Return the root node of a binary search tree that matches the given preorder traversal.
 * 
 * (Recall that a binary search tree is a binary tree where for every node, any descendant 
 * of node.left has a value < node.val, and any descendant of node.right has a value > node.val.  Also recall that a preorder traversal displays the value of the node first, then traverses node.left, then traverses node.right.)
 * 
 * Example 1:
 * Input: [8,5,1,7,10,12]
 * Output: [8,5,10,1,7,null,12]
 * 
 * Note: 
 * 1 <= preorder.length <= 100
 * The values of preorder are distinct.
 *
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BstFromPreorder {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			val = x;
		}
	}
	
	private void insertNode(TreeNode root, TreeNode node) {
		if(root.val > node.val) {
			if(root.left == null) {
				root.left = node;
			} else {
				insertNode(root.left, node);
			}
		}
		else {
			if(root.right == null) {
				root.right = node;
			} else {
				insertNode(root.right, node);
			}	
		}
	}
	
    public TreeNode bstFromPreorder(int[] preorder) {
    	TreeNode root = null;
    	if(preorder.length > 0) {
	    	root = new TreeNode(preorder[0]);
	        for(int start = 1; start < preorder.length; start++) {
	        	insertNode(root, new TreeNode(preorder[start]));
	        }
    	}
        return root;
    }
}
