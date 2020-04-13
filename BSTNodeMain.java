import java.util.Arrays;


/**
 * A BSTNodeMain is a Class for test the class 
 * BSTNode Class.
 */
public class BSTNodeMain { 
	public static void main(String[] args) {
		
		
		// creates five profile objects of Profile Class.
		Profile profile1 = new Profile("Andrea", 12,9,1999, "Limassol", "Cyprus", "Cypriot",new String [] {"Shopping"});
		Profile profile2 = new Profile("Themis", 2,2,1997, "Buenos Aires", "Argentina", "Argentinian",new String[] {"Badmiton"});
		Profile profile3 = new Profile("Nicolas", 5,8,1994, "Larnaca", "Cyprus", "Cypriot",new String[] {"Basketball"});
		Profile profile4 = new Profile("Giannis", 7,1,2000, "Porto Alegre", "Brazil", "Brazilian",new String[] {"Playstation"});
		Profile profile5 = new Profile("Kleanthis", 8,12,2004, "Ottawa", "Canada", "Canadian",new String[] {"Pool"});
		
		
		// creates five nodes that puts the 
		// profile objects here.
		BSTNode node1 = new BSTNode(profile1);
		BSTNode node2 = new BSTNode(profile2); 
		BSTNode node3 = new BSTNode(profile3);
		BSTNode node4 = new BSTNode(profile4); 
		BSTNode node5 = new BSTNode(profile5); 
		
		
		// sets the root, the left and 
		// the right nodes of 
		// the binary search tree node.
		node1.setLeft(node2);
		node1.setRight(node3);
		node2.setLeft(node4); 
		node2.setRight(node5);
		
		
		// prints the nodes which represents 
		// the profile objects and also the 
		// array of interests of each profile.
		System.out.println(node1.getProfile());  
		profile1.getInterests();
		System.out.println(node1.getLeft().getProfile()); 
		profile2.getInterests();
		System.out.println(node1.getRight().getProfile());
		profile3.getInterests();
		System.out.println(node2.getLeft().getProfile()); 
		profile4.getInterests();
		System.out.println(node2.getRight().getProfile());
		profile5.getInterests();
   }
}
