import java.util.ArrayList;
/**
* Profile class which creates a profile of people.
*/
public class Profile {
	
	
	// the name of people.
	private String name;
	// the day which people born.
	private int day;
	//the month which people born.
	private int month;
	//the year which people born.
	private int year;
	//the town of residence.
	private String townOfResidence;
	//the country of residence.
	private String countryOfResidence;
	//the nationality of people.
	private String nationality;
	// An Array of interests of people which represented
	// as strings.
	private String[] interests;
	// An ArrayList of friends of people which represented 
	// as references to Profile class. 
	ArrayList<Profile> friends = new ArrayList<Profile>();
	
	
	
	/**
	 * Creates a Profile.
	 * @param name The name profile of people.
	 * @param day The day which people born.
	 * @param month The month which people born.
	 * @param year The year which people born.
	 * @param townOfResidence The town of Residence.
	 * @param countryOfResidence The country of Residence.
	 * @param nationality The nationality of People.
	 * @param interests An Array of interests of people which represented
	 * as references to Profile class.
	 */
	public Profile(String name, int day, int month, int year, String townOfResidence, String countryOfResidence, String nationality, String[] interests) {
		this.name = name;
		this.day = day;
		this.month = month;
		this.year = year;
		this.townOfResidence = townOfResidence;
		this.countryOfResidence = countryOfResidence;
		this.nationality = nationality;
		this.interests = interests; 
	}
	
	
	
	/**
	 * A Method that sets the name.
	 * @param name of people.
	 */
	public void setName(String name) {
		this.name = name; 
	} 
	
	
	
	/**
	 * A Method that sets the Town of Residence.
	 * @param townOfResidence.
	 */
	public void setTownOfResidence(String townOfResidence) {
		this.townOfResidence = townOfResidence;
	}
	
	
	
	/**
	 * A Method that sets the country of Residence.
	 * @param countryOfResdince.
	 */
	public void setCountryOfResidence(String countryOfResdince) {
		this.countryOfResidence = countryOfResidence;
	}
	
	
	
	/**
	 * A Method that sets the Nationality of people.
	 * @param nationality.
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	
	
	/**
	 * A Method that sets the interests of people.
	 */
	public void setInterests() {
		this.interests = interests;
	}
	
	
	
	/**
	 * A Method that sets the Day Of Birth
	 * that people born.
	 * @param day
	 * @param month
	 * @param year
	 */
	public void setDateOfBirth(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
	
	/**
	 * A Method that adds friends to other profiles.
	 * @param p
	 */
	public void addFriend(Profile p) {
		this.friends.add(p);
	}
	
	
	
	/**
	 * A Method that gets the town of residence.
	 * @return the Town of Residence.
	 */
	public String getTownOfResidence() {
		return townOfResidence;
	}
	
	
	
	/**
	 * A Method that gets the country of residence.
	 * @return the Country of Residence.
	 */
	public String getCountryOfResidence() {
		return countryOfResidence;
	}
	
	
	
	/**
	 * A method that gets the nationality.
	 * @return the nationality of people.
	 */
	public String getNationality() {
		return nationality;
	}
	
	
	
	/**
	 * A Method that prints an array that represents
	 * the interests of people.
	 */
	public void getInterests() {
		/* This loop prints the interests of people */
		for(int o = 0; o < interests.length; o++) {
			System.out.println(interests[o]+" ");
		}
	}
	
	
	
	/**
	 * A method that gets the date of birth.
	 * @return the Date of Birth of people.
	 */
	public String getDateOfBirth() { 
		return day+ "/" + month + "/" + year;
	}
	
	
	
	/**
	 * A Method that gets Friends from profile to 
	 * other profiles.
	 * @param i
	 * @return the friends.
	 */
	public Profile getFriend(int i) {
		return friends.get(i);
	}
	
	
	
	/**
	 * A Method that returns an array which represents 
	 * the number of friends. 
	 * @return the number of friends.
	 */
	public int numOfFriends() {
		return friends.size();
	}
	
	
	
	/**
	 * A Method that gets the name of people.
	 * @return name of people.
	 */
	public String getName() {
		return name;
	}
	
	
	
	/**
	 * Method to convert a profile to a string.
	 */
	public String toString() {
		return (name+" "+day+"/"+month+"/"+year+" "+townOfResidence+" "+ 
				countryOfResidence+" "+nationality+" "+interests+" "+friends);
	}
}

