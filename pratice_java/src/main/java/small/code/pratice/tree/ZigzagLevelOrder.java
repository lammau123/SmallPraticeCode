package small.code.pratice.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Binary Tree Zigzag Level Order Traversal
 * Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).
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
 * return its zigzag level order traversal as:
 * 
 * [
 *   [3],
 *   [20,9],
 *   [15,7]
 * ]
 *
 */
public class ZigzagLevelOrder {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> rs = new ArrayList<>();
		Deque<Deque<TreeNode>> queues = new ArrayDeque<>();
		if(root != null) {
			Deque<TreeNode> stack = new ArrayDeque<>();
			stack.push(root);
			queues.add(stack);
			int deep = 1;
			while(!queues.isEmpty()) {
				List<Integer> lst = new ArrayList<>();
				Deque<TreeNode> nextLevel = new ArrayDeque<>();
				Deque<TreeNode> curLevel = queues.pollFirst();
				while(!curLevel.isEmpty()) {
					TreeNode node = curLevel.pop();
					lst.add(node.val);
					if(deep%2 == 1) {
						if(node.left != null) {
							nextLevel.push(node.left);
						}
						if(node.right != null) {
							nextLevel.push(node.right);
						}
					} else {
						if(node.right != null) {
							nextLevel.push(node.right);
						}
						if(node.left != null) {
							nextLevel.push(node.left);
						}
					}
				}
				deep++;
				if(!nextLevel.isEmpty()) queues.add(nextLevel);
				rs.add(lst);
			}
		}		
		return rs;
    }
}
