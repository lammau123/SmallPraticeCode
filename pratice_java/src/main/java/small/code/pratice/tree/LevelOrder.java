package small.code.pratice.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LevelOrder {
	public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> rs = new ArrayList<List<Integer>>();
    	List<List<TreeNode>> tree = new ArrayList<List<TreeNode>>();
    	if(root != null) {
    		tree.add(Arrays.asList(root));
    	}
    	for(int index = 0; index < tree.size(); index++) {
    		List<TreeNode> nodes = tree.get(index);
    		List<Integer> nums = new ArrayList<>();
    		List<TreeNode> nextLevel = new ArrayList<>();
    		for(TreeNode node: nodes) {
    			nums.add(node.val);
    			if(node.left != null) {
    				nextLevel.add(node.left);
    			}
    			if(node.right != null) {
    				nextLevel.add(node.right);
    			}
    		}
    		if(!nums.isEmpty()) {
    			rs.add(nums);
    		}
    		if(!nextLevel.isEmpty()) {
    			tree.add(nextLevel);
    		}
    	}
    	return rs;
    }
}
