package small.code.pratice.tree;

import java.util.StringJoiner;

//import small.code.pratice.tree.SerializeTreeTest.c;

public class SerializeTree {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
    	StringJoiner joiner = new StringJoiner(",");
    	serialize(joiner, root);
        return joiner.toString();
    }
    private void serialize(StringJoiner joiner, TreeNode root) {
		if(root != null) {
			joiner.add(String.valueOf(root.val));
			serialize(joiner, root.left);
			serialize(joiner, root.right);
		} else {
			joiner.add("null");
		}
	}
	// Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
    	if(data.isEmpty()) return null;
    	String[] datas = data.split(",");
    	if(datas[0].equals("null")) return null;
    	TreeNode root = new TreeNode(Integer.parseInt(datas[0]));
        deserialize(root, datas, 1);
        return root;
    }
    
    public int deserialize(TreeNode node, String[] data, int index) {
    	int next =  index;
    	if(next < data.length) {
	        if(!data[next].equals("null")) {
	        	node.left = new TreeNode(Integer.parseInt(data[next]));
	        	next = deserialize(node.left, data, next + 1);
	        } else {
	        	next++;
	        }
	        if(!data[next].equals("null")) {
	        	node.right = new TreeNode(Integer.parseInt(data[next]));
	        	next =  deserialize(node.right, data, next + 1);
	        } else {
	        	next++;
	        }
    	}
    	return next;
    }
}
