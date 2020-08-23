package small.code.pratice.tree;

public class LowestCommonAncestor {
	private TreeNode node;
	
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    	_lowestCommonAncestor(root, p, q);
    	return node;
    }
    
    public boolean _lowestCommonAncestor(TreeNode currentNode, TreeNode p, TreeNode q) {
        if(currentNode == null) {
        	return false;
        }
        
        int mid = (currentNode == p || currentNode == q) ? 1 : 0;
        int left = _lowestCommonAncestor(currentNode.left, p, q) ? 1 : 0;
        int right = _lowestCommonAncestor(currentNode.right, p, q) ? 1 : 0;
        
        if (mid + left + right >= 2) {
        	this.node = currentNode;
        }
        
        return (mid + left + right > 0);
    }
}
