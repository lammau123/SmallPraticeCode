package small.code.pratice.tree;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import small.code.pratice.tree.PseudoPalindromicPaths.TreeNode;

public class PseudoPalindromicPathsTest {
	@Test
	void testPseudoPalindromicPaths() {
		assertTrue(new PseudoPalindromicPaths().pseudoPalindromicPaths(new TreeNode(2, new TreeNode(1, new TreeNode(1), new TreeNode(3, null, new TreeNode(1))), new TreeNode(1))) == 1);
		assertTrue(new PseudoPalindromicPaths().pseudoPalindromicPaths(new TreeNode(2, new TreeNode(3, new TreeNode(3), new TreeNode(1)), new TreeNode(1, null, new TreeNode(1)))) == 2);
	}
}
