package small.code.pratice.tree;

/**
 * Binary Tree Maximum Path Sum
 * 
 *  * Given a non-empty binary tree, find the maximum path sum.
 * 
 * For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The path must contain at least one node and does not need to go through the root.
 * 
 * Example 1:
 * 
 * Input: [1,2,3]
 * 
 *        1
 *       / \
 *      2   3
 * 
 * Output: 6
 * 
 * Example 2:
 * 
 * Input: [-10,9,20,null,null,15,7]
 * 
 *    -10
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 
 * Output: 42
 * 
 * Definition for a binary tree node.
 * 
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
class MaxPathSum {
	 public static class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode() {}
		      TreeNode(int val) { this.val = val; }
		      TreeNode(int val, TreeNode left, TreeNode right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;
		     }
		  };
	private int max = Integer.MIN_VALUE;
	private int dfs(TreeNode root) {
		if(root == null) return 0;
		int left = Math.max(0, dfs(root.left));
        int right = Math.max(0, dfs(root.right));
        max = Math.max(max, left + right + root.val);
        return root.val + Math.max(left, right);
	}
    public int maxPathSum(TreeNode root) {
    	dfs(root);
    	return max;
    }
}