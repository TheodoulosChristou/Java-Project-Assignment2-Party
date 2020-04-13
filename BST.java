/**
 * BST is a binary tree class which creates
 * a preliminary binary search tree that the nodes
 * from the previous class BSTNode will put right here 
 * as left nodes, right nodes and as root.
 *
 */
public class BST {
	
	
   // The root of the binary tree
   // which is null.
   BSTNode root = null;
	
   
   /**
    * This is the constructor of BST class 
    * which is null.
    */
	public BST() {
		
	} 
	
	
	/**
	 * A Method that compares two nodes from the BSTNode
	 * which the node is the root and if it's greater than
	 * zero then stands out the left nodes, the right nodes
	 * and the root node.
	 * @param nNode
	 */
	private void testMethod(BSTNode nNode) {
		
		
		//creates a node of BSTNode as root.
		BSTNode node = root;
		
		
		if (node.getProfile().getName().compareTo(nNode.getProfile().getName()) > 0) {
			/* compares the name profile of two BSTNodes nodes*/
			if(node.getLeft() == null) {
				/* if the node that gets at left is null,
				 * then sets the nNode as left child
				 * and calls again the method,
				 * which means is a recursive.
				 */
				node.setLeft(nNode);
				testMethod(node); 
			} else { 
				/* it gets the node as left child
				 * and sets the nNode as left.
				 */
				node = node.getLeft();
				node.setLeft(nNode);
		   }
		}
		else {
            if(node.getRight() ==  null) {
            	/* if the node that gets at right is null,
            	 * then sets the nNode as right child
            	 * and calls again the method,
            	 * which means is a recursive.
            	 */
				node.setRight(nNode);
				testMethod(node);
			} else {
				/* it gets the node as right child
				 * and sets the nNode as right.
				 */
				node = node.getRight();
				node.setRight(nNode);
			}
		} 
   }
	
	
	/**
	 * A Method that place a reference to the profile
	 * and checks if the root is null,and if it is then,
	 * creates a newNode of BSTNode as a result, this node
	 * becomes the root. Otherwise, it creates a profile 
	 * of BSTNode class and calls the private method that
	 * create, that is recursive.
	 * @param p
	 */
	public void insertProfile(Profile p) {
		if(root == null) {
			/* if the root is null then,
			 * it creates a newNode of 
			 * BSTNode class and that newNode
			 * becomes the root.
			 */
			BSTNode newNode = new BSTNode(p);
			root = newNode;
		} else {
			/* it creates a profile of BSTNode
			 * class and calls the private method
			 * that create above, that is recursive.
			 */
			BSTNode profile = new BSTNode(p);
			testMethod(profile);
		}
	}
	
	
	/**
	 * A Method that prints out the
	 * binary search tree
	 * in alphabetical order.
	 */
	public void printAlphabetical() {
		
		
		// creates a node of BSTNode class as root 
		BSTNode o = root;
		
		
		if(root != null) {
			/* if the root isn't null then,
			 * it prints the name of profiles,
			 * the root gets the left child,
			 * it calls the method again,
			 * and equals the node that create,
			 * as right child to the root and
			 * calls the method.
			*/
			System.out.println(root.getProfile().getName());
			root = root.getLeft();
			printAlphabetical();
			root = o.getRight();
			printAlphabetical();	
	  }
	}
}

