package application;

public class BST {

	class Node {
        int key;
        Node left, right;
 
        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }
	
	Node root;
	
	void insert(int key) { root = insertKey(root, key); }
	
	 // recursive function inserts key into binary search tree
	Node insertKey(Node root, int key)
	    {
	 
			//returns new node if tree is empty
	        if (root == null) {
	            root = new Node(key);
	            return root;
	        }
	 	      
	        if (key < root.key)
	            root.left = insertKey(root.left, key);
	        else if (key > root.key)
	            root.right = insertKey(root.right, key);
	 
	        return root;
	    }
	
	void inorder() { inorderRec(root); }
	
	//traverses the tree
	void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
	

}
