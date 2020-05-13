package small.code.pratice.tree;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import small.code.pratice.tree.Cousins.TreeNode;

public class CousinsTest {
	@Test
	void testCousins() {
		TreeNode treeNode = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3));
		assertTrue(new Cousins().isCousins(treeNode, 4, 3) == false);
		
		TreeNode treeNode1 = new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3, null, new TreeNode(5)));
		assertTrue(new Cousins().isCousins(treeNode1, 4, 5) == true);
		
		TreeNode treeNode2 = new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3));
		assertTrue(new Cousins().isCousins(treeNode2, 2, 3) == false);
		
		TreeNode treeNode3 = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
		assertTrue(new Cousins().isCousins(treeNode3, 4, 5) == false);
	}
}
