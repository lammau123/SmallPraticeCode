package small.code.pratice.tree;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> rs = new ArrayList<Integer>();
        traversal(root, rs);
        return rs;
    }
    
    private void traversal(TreeNode root, List<Integer> rs) {
    	if(root != null) {
    		traversal(root.left, rs);
    		rs.add(root.val);
    		traversal(root.right, rs);
    	}
    }
}
