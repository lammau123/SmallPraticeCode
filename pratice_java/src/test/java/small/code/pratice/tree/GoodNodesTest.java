package small.code.pratice.tree;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import small.code.pratice.tree.GoodNodes.TreeNode;

public class GoodNodesTest {
	@Test
	void testGoodNodes() {
		assertTrue(new GoodNodes().goodNodes(new TreeNode(5, new TreeNode(3, new TreeNode(2, new TreeNode(4, new TreeNode(4), null), null), null), null)) == 1);
		
		TreeNode root = new TreeNode(3, new TreeNode(1, new TreeNode(3), null), new TreeNode(4, new TreeNode(1), new TreeNode(5)));
		assertTrue(new GoodNodes().goodNodes(root) == 4);
		assertTrue(new GoodNodes().goodNodes(new TreeNode(9, null, new TreeNode(3, new TreeNode(6), null))) == 1);
	}
}
