package small.code.pratice.tree;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import small.code.pratice.tree.MaxPathSum.TreeNode;

public class MaxPathSumTest {
	
	@Test
	void testMaxPathSum() {
		TreeNode tree15 = new TreeNode();
		tree15.val = 15;
		TreeNode tree7 = new TreeNode();
		tree7.val = 7;
		TreeNode tree20 = new TreeNode();
		tree20.val = 20;
		tree20.left = tree15;
		tree20.right = tree7;
		TreeNode tree9 = new TreeNode();
		tree9.val = 9;
		
		TreeNode tree10 = new TreeNode();
		tree10.val = -10;
		tree10.left = tree9;
		tree10.right = tree20;
		assertTrue(new MaxPathSum().maxPathSum(tree10) == 42);
		
		TreeNode tree3 = new TreeNode();
		tree3.val = 1;
		tree3.left = new TreeNode(2);
		assertTrue(new MaxPathSum().maxPathSum(tree3) == 3);
		
		TreeNode tree1 = new TreeNode(1, new TreeNode(-2), new TreeNode(3));
		assertTrue(new MaxPathSum().maxPathSum(tree1) == 4);
	}
}
