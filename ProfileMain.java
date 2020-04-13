
/**
 * ProfileMain is a class that is used to test the 
 * Profile Class.
 */
public class ProfileMain {
	
	public static void main(String[] args) {
		
		
		// creates two objects of profile
		Profile profile1 = new Profile("Theos", 3,4,1998,"Nicosia", "Cyprus", "Cypriot",new String[] {"Volley","Football"});
		Profile profile2 = new Profile("Andrea", 12,9,1999, "Limassol", "Cyprus", "Cypriot",new String[] {"Shopping","Theatre"});
		
		
		// prints the profiles,the number of friends
		// of the first profile and the interests of them.
		System.out.println(profile1.toString());
		profile1.getInterests();
		System.out.println(profile1.numOfFriends());
		System.out.println(profile2.toString());
		profile2.getInterests();
	} 
}
 