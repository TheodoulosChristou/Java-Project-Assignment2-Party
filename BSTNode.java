/**
 * BSTNode is a class that creates 
 * a binary search tree node.
 */
public class BSTNode {
	
	
	// the data which is a reference
	// to a profile.
	private Profile data;
	
	
	// a reference to the left child.
	private BSTNode left;
	 
	
	// a reference to the right child.
	private BSTNode right;
	
	
	/**
	 * This is the constructor of BSTNode,
	 * takes the parameter data which is a reference 
	 * to a Profile.
	 * @param data which is a reference to a profile.
	 */
	public BSTNode(Profile data) {
		this.data = data;
	}
	
	
	/**
	 * A Method which gets the profile
	 * associated with this node.
	 * @return data which is a reference to a profile.
	 */
	public Profile getProfile() {
		return data;
	}
	
	
	/**
	 * A Method which sets the left child
	 * of this to l node.
	 * @param l
	 */
	public void setLeft(BSTNode l) {
		this.left = l; 
	}
	
	
	/**
	 * A Method which sets the right child
	 * of this to r node.
	 * @param r
	 */
	public void setRight(BSTNode r) {
		this.right = r; 
	}
	
	
	/**
	 * A Method which gets the left child 
	 * of this
	 * @return left child.
	 */
	public BSTNode getLeft() {
		return left;
	}
	
	
	/**
	 * A Method which gets the right child 
	 * of this.
	 * @return right child.
	 */
	public BSTNode getRight() {
		return right;
	}
	
	
	/**
	 * A Method that converts the data to a string.
	 */
	public String toString() {
		return (data + " "); 
	}
}
