import java.io.File;

/**
 * BSTMain is a Class that is used to test 
 * all the methods from the BST Class
 * except of method printAlphabeticalOrder().
 */
public class BSTMain  {
	public static void main(String[] args) {
		
		
		// creates five objects of profile.
		Profile prof1 = new Profile("Iron Man",4,4,1965,"New York","USA","American", new String[] {"Rugby"});
		Profile prof2 = new Profile("Hulk",18,8,1969,"Massachusetts","USA","American", new String[] {"Arts"});
		Profile prof3 = new Profile("Thor",11,8,1983,"Melbourne","Australia","Australian", new String[] {"Volleyball"});
		Profile prof4 = new Profile("Black Panther",29,11,1977,"South California","USA","American", new String[] {"Golf"});
		Profile prof5 = new Profile("Captain American",13,6,1981,"Boston","USA","American", new String[] {"Cricket"});
		
		
		// creates a binary search tree
		// and inserts the profile objects
		// in that.
		BST newBiTree = new BST();
		newBiTree.insertProfile(prof2);
		newBiTree.insertProfile(prof1);
		newBiTree.insertProfile(prof5); 
		newBiTree.insertProfile(prof4); 
		newBiTree.insertProfile(prof3);
		
		
		// prints the binary search tree.
		System.out.println(newBiTree.root);
		newBiTree.root.getProfile().getInterests();
		System.out.println(newBiTree.root.getRight()); 
		newBiTree.root.getRight().getProfile().getInterests();
		System.out.println(newBiTree.root.getLeft());
		newBiTree.root.getLeft().getProfile().getInterests();
		System.out.println(newBiTree.root.getRight().getRight());
		newBiTree.root.getRight().getRight().getProfile().getInterests();
		System.out.println(newBiTree.root.getLeft().getLeft());
		newBiTree.root.getLeft().getLeft().getProfile().getInterests();
	} 
}

