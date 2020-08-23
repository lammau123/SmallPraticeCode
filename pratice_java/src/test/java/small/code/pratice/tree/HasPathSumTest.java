package small.code.pratice.tree;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class HasPathSumTest {
	@Test
	public void testHasPathSum() {
		assertTrue(new HasPathSum().hasPathSum(new TreeNode(1, new TreeNode(-2), new TreeNode(3)), -1) == true);
	}
}
