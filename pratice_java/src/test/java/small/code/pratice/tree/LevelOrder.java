package small.code.pratice.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Binary Tree Level Order Traversal
 * Given a binary tree, return the level order traversal of its nodes' values. 
 * (ie, from left to right, level by level).
 * 
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 * 
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 
 * return its level order traversal as:
 * 
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 *
 */
public class LevelOrder {
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
	}
	
    public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> rs = new ArrayList<List<Integer>>();
    	List<List<TreeNode>> tree = new ArrayList<List<TreeNode>>();
    	if(root != null) {
    		tree.add(Arrays.asList(root));
    	}
    	for(int index = 0; index < tree.size(); index++) {
    		List<TreeNode> nodes = tree.get(index);
    		List<Integer> nums = new ArrayList<>();
    		List<TreeNode> nextLevel = new ArrayList<>();
    		for(TreeNode node: nodes) {
    			nums.add(node.val);
    			if(node.left != null) {
    				nextLevel.add(node.left);
    			}
    			if(node.right != null) {
    				nextLevel.add(node.right);
    			}
    		}
    		if(!nums.isEmpty()) {
    			rs.add(nums);
    		}
    		if(!nextLevel.isEmpty()) {
    			tree.add(nextLevel);
    		}
    	}
    	return rs;
    }
}
