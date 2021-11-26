package small.code.pratice.tree;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SerializeTreeTest {
	@Test
	public void testSerialize() {
		TreeNode treeNode = new TreeNode(1, new TreeNode(2), new TreeNode(3));
		String result = new SerializeTree().serialize(treeNode);
		assertTrue(result.equals("1,2,null,null,3,null,null"));
		TreeNode root = new SerializeTree().deserialize(result);
		assertTrue(root != null);
	}
	
	@Test
	public void testSerialize1() {
		TreeNode treeNode = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), null));
		String result = new SerializeTree().serialize(treeNode);
		assertTrue(result.equals("1,2,null,null,3,4,null,null,null"));
	}
}


