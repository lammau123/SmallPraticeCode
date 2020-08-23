package small.code.pratice.tree;

/**
 * Construct Binary Tree from Preorder and Inorder Traversal
 * 
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 * 
 * Note:
 * You may assume that duplicates do not exist in the tree.
 * 
 * For example, given
 * 
 * preorder = [3,9,20,15,7]
 * inorder = [9,3,15,20,7]
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
public class BuildTree1 {
	private int preorderIndex = 0;
	public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, inorder, 0, inorder.length-1);
    }
	
	private TreeNode buildTree(int[] preorder, int[] inorder, int start, int end) {
		if(start > end) {
			return null;
		}
		
		TreeNode root = new TreeNode(preorder[preorderIndex]);
        preorderIndex++;
        
		if(start == end) {
			return root;
		}
		
		int rootIndex = search(inorder, start, end, preorder[preorderIndex-1]);
		root.left = buildTree(preorder, inorder, start, rootIndex - 1);
        root.right = buildTree(preorder, inorder, rootIndex + 1, end);
        
        return root;
	}

	int search(int arr[], int strt, int end, int value) { 
        int i; 
        for (i = strt; i <= end; i++) { 
            if (arr[i] == value) 
                break; 
        } 
        return i; 
    } 
}
