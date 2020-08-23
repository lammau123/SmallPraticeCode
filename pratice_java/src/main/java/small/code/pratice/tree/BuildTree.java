package small.code.pratice.tree;

/**
 * Construct Binary Tree from Inorder and Postorder Traversal
 * 
 * Given inorder and postorder traversal of a tree, construct the binary tree.
 * 
 * Note:
 * You may assume that duplicates do not exist in the tree.
 * 
 * For example, given
 * 
 * inorder = [9,3,15,20,7]
 * postorder = [9,15,7,20,3]
 * 
 * Return the following binary tree:
 * 
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 */
public class BuildTree {
    private int k;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        k=postorder.length-1;
    	return buildTree(inorder, 0, inorder.length-1, postorder);
    }

	private TreeNode buildTree(int[] inorder, int start, int end, int[] postorder) {
		if(start > end) return null;
		int rootIndex = search(inorder, start, end, postorder[k]);
		TreeNode root = new TreeNode(postorder[k--]);
		if(start==end) return root;
		root.right = buildTree(inorder, rootIndex + 1, end, postorder);
		root.left = buildTree(inorder, start, rootIndex - 1, postorder);
		return root;
	}
	int search(int arr[], int strt, int end, int value) 
    { 
        int i; 
        for (i = strt; i <= end; i++) { 
            if (arr[i] == value) 
                break; 
        } 
        return i; 
    } 
}
