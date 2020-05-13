package small.code.pratice.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Cousins in Binary Tree
 * 
 * In a binary tree, the root node is at depth 0, and children of each depth k node 
 * are at depth k+1.
 * 
 * Two nodes of a binary tree are cousins if they have the same depth, but have 
 * different parents.
 * 
 * We are given the root of a binary tree with unique values, and the values x 
 * and y of two different nodes in the tree.
 * 
 * Return true if and only if the nodes corresponding to the values x and y are 
 * cousins.
 * 
 * Example 1:
 * 
 * Input: root = [1,2,3,4], x = 4, y = 3
 * Output: false
 * 
 * Example 2:
 * 
 * Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
 * Output: true
 * 
 * Example 3:
 * 
 * Input: root = [1,2,3,null,4], x = 2, y = 3
 * Output: false
 * 
 * Note:
 * 
 *     The number of nodes in the tree will be between 2 and 100.
 *     Each node has a unique integer value from 1 to 100.
 * 
 *
 */
public class Cousins {
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
	
    public boolean isCousins(TreeNode root, int x, int y) {
    	List<List<TreeNode>> list = new ArrayList<List<TreeNode>>(); 
        if(root == null || root.left == null || root.right == null) {
        	return false;
        }
        boolean foundx = false, foundy = false;
        list.add(Arrays.asList(root.left, root.right));
        for(int index = 0; index < list.size(); index++) {
        	List<TreeNode> nextLevel = new ArrayList<>();
        	for(int index1 = 0; index1 < list.get(index).size(); index1++) {
        		TreeNode node = list.get(index).get(index1);
        		if(node.left != null) {
        			if(node.left.val == x) {
        				foundx = true;
        				continue;
        			} else if(node.left.val == y) {
        				foundy = true;
        				continue;
        			}
        			nextLevel.add(node.left);
        		} 
        		if(node.right != null) {
        			if(node.right.val == x) {
        				foundx = true;
        				continue;
        			} else if(node.right.val == y) {
        				foundy = true;
        				continue;
        			}
        			nextLevel.add(node.right);
        		} 
        		
        	}
        	if(foundx && foundy) {
    			return true;
    		}
        	if(foundx || foundy) {
        		return false;
        	}
        	if(nextLevel.size() > 0) {
        		list.add(nextLevel);
        	}
        }
        return false;
	}
}
