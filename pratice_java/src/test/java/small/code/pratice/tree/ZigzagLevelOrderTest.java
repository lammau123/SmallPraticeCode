package small.code.pratice.tree;

import org.junit.jupiter.api.Test;

public class ZigzagLevelOrderTest {
	@Test
	void testZigzagLevelOrder() {
		//[3,9,20,null,null,15,7]
		TreeNode _1 = new TreeNode(3, 
				new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7))
				);
		new ZigzagLevelOrder().zigzagLevelOrder(_1);
		//[1,2,3,4,null,null,5]
		_1 = new TreeNode(1, 
				new TreeNode(2, new TreeNode(4), null), new TreeNode(3, null, new TreeNode(5))
				);
		new ZigzagLevelOrder().zigzagLevelOrder(_1);
	}
}
