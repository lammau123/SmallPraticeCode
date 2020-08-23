package small.code.pratice;

import small.code.pratice.tree.Node;

/**
 * terraform {
 *   backend "s3" {
 *     # Replace this with your bucket name!
 *     bucket         = "${aws_s3_bucket.terraform_state.id}"
 *     key            = "global/s3/terraform.tfstate"
 *     region         = "us-east-1"
 *     # Replace this with your DynamoDB table name!
 *  #   dynamodb_table = "terraform-up-and-rPopulating Next Right Pointers in Each Node II
 * 
 * Given a binary tree
 * 
 * struct Node {
 *   int val;
 *   Node *left;
 *   Node *right;
 *   Node *next;
 * }
 * 
 * Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
 * 
 * Initially, all next pointers are set to NULL.
 * 
 *  
 * 
 * Follow up:
 * 
 *     You may only use constant extra space.
 *     Recursive approach is fine, you may assume implicit stack space does not count as extra space for this problem.
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: root = [1,2,3,4,5,null,7]
 * Output: [1,#,2,3,#,4,5,7,#]
 * Explanation: Given the above binary tree (Figure A), your function should populate each next pointer to point to its next right node, just like in Figure B. The serialized output is in level order as connected by the next pointers, with '#' signifying the end of each level.
 * 
 *  
 * 
 * Constraints:
 * 
 *     The number of nodes in the given tree is less than 6000.
 *     -100 <= node.val <= 100
 * @author mlam21
 *
 */
public class PerfectBinaryTree1 {
	public Node connect(Node root) {
        if(root == null) return null;
        _connect(root);
        
        return root;
    }
    
    public void oneLevelConnect(Node root) {
    	if(root.left != null) {
        	root.left.next = root.right;
        } 
        Node node = getNextNodeHasChild(root.next);
        if(node != null) {
	        if(root.right != null) {
	        	root.right.next = node.left != null ? node.left : node.right;     	
	        } else if(root.left != null) {
	        	root.left.next = node.left != null ? node.left : node.right;
	        }
	        oneLevelConnect(node);
        }
    }
    
    private void _connect(Node root) {
    	oneLevelConnect(root);
    	Node node = getNextNodeHasChild(root.left != null ? root.left : root.right);
    	if(node != null) {
    		_connect(node);
    	}
    }
    
    private boolean hasChildNode(Node node) {
    	return node.left != null || node.right != null;
    }
    
    private Node getNextNodeHasChild(Node node) {
    	if(node != null) {
    		if(hasChildNode(node)) {
	    		return node;
	    	}
	    	if(node.next != null) {
	    		return getNextNodeHasChild(node.next);
	    	}
    	}
    	return null;
    }
}
