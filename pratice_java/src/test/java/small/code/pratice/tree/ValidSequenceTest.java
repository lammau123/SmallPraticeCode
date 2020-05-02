package small.code.pratice.tree;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import small.code.pratice.tree.ValidSequence.TreeNode;

public class ValidSequenceTest {
	@Test
	void testValidSequence() {
		TreeNode treeNode = new TreeNode(1, new TreeNode(2), new TreeNode(3));
		assertTrue(new ValidSequence().isValidSequence(treeNode, new int[] {1}) == false);
		TreeNode treeNode1 = new TreeNode(1, new TreeNode(2), null);
		assertTrue(new ValidSequence().isValidSequence(treeNode1, new int[] {1}) == false);
		TreeNode treeNode2 = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
		assertTrue(new ValidSequence().isValidSequence(treeNode2, new int[] {1, 3, 5}) == true);
	}
}
