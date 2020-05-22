package small.code.pratice.tree;

public class GoodNodes {
	public static class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode() {}
	    TreeNode(int val) { this.val = val; }
	    TreeNode(int val, TreeNode left, TreeNode right) {
	        this.val = val;
	        this.left = left;
	        this.right = right;
	    }
	}
    
	public int goodNodes(TreeNode root) {
		return goodNodes(root, root.val);
    }
	
    private int goodNodes(TreeNode root, int rootValue) {
        if(root == null) {
        	return 0;
        }
        
        return ((root.val >= rootValue ? 1 : 0) + goodNodes(root.left, Math.max(root.val, rootValue)) + goodNodes(root.right, Math.max(root.val, rootValue)));
    }
}
