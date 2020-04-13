/**
 * AlphaMain is a Class that is used to test
 * if the printAlphabeticalOrder method from the
 * BST class works.
 */
public class AlphaMain {
	public static void main(String[] args) {
		
		
		//creates five profile objects.
		Profile p1 = new Profile("Giorgos",12,9,1999,"Limassol","Cyprus","Cypriot", new String[] {"Shopping"});
		Profile p2 = new Profile("Bironas",11,8,1987,"Famagusta","Cyprus","Cypriot", new String[] {"Football"});
		Profile p3 = new Profile("Themis",10,7,1988,"Larnaca","Cyprus","Cypriot", new String[] {"bet"});
		Profile p4 = new Profile("Elena",7,6,1940,"Nicosia","Cyprus","Cypriot", new String[] {"Football"});
		Profile p5 = new Profile("Thanos",1,5,1932,"Paphos","Cyprus","Cypriot", new String[] {"Volley"});
		
		
		// creates a binary search tree
		// and inserts the profile objects
		// in that.
		BST nBt = new BST();
		nBt.insertProfile(p1);
		nBt.insertProfile(p2);
		nBt.insertProfile(p3);
		nBt.insertProfile(p4);
		nBt.insertProfile(p5);
		
		
		// prints the alphabeticalOrder. 
		nBt.printAlphabetical();
	}
}
