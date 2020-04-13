import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;



/**
 * This class reads a profile.
 * Also, please see the profile file Text.txt.
 */
public class FileReader {
	
	
	/**
	 * Method to read the file and return the profiles from this file. The
	 * program should handle the file not found exception here and shut down the
	 * program gracefully.
	 * 
	 * @param filename
	 *            the name of the file
	 * @return the profile from the file
	 */
	public static BST readProfiles(String filename) {
		 Scanner in = null;
		    try {
		    	in = new Scanner(new File(filename));
		    } 
		    catch (FileNotFoundException e1) {
				System.out.println("File not found");
			}
		    return FileReader.readFile(in);
 
	}
	
	
	/**
	 * This method reads the profile from the constructor of the 
	 * Profile Class.
	 * @param r represents the Scanner of the filename of profile.
	 * @return nProfile
	 */
	public static Profile profile(Scanner r) {
		
		/**@param r.useDelimeter a character that identifies
		 * the beginning or the end of a character string.
		 * @param name The name profile of people.
		 * @param day The day which people born.
		 * @param month The month which people born.
		 * @param year The year which people born.
		 * @param townOfResidence The town of Residence.
		 * @param countryOfResidence The country of Residence.
		 * @param nationality The nationality of People.
		 * @param interests An Array of interests of people which represented
		 * as references to Profile class.
		 * @param interest.split a character that partition the interests
		 * of people at profiles.
		 */
		r.useDelimiter(",");
		String name = r.next(); 
		int day = r.nextInt();
		int month = r.nextInt();
		int year = r.nextInt();
		String townOfResidence = r.next();
		String countryOfResidence = r.next(); 
		String nationality = r.next();
		String interestOfPerson = r.next();
		String[] interests = interestOfPerson.split(";");
		Profile nProfile = new Profile(name,day,month,year,townOfResidence,countryOfResidence,nationality,interests);
		return nProfile;
	}
	
	
	/**
	 * Reads the data file used by the program and returns the constructed BST
	 *   
	 * @param in
	 *            the scanner of the file.
	 * @return createBST which represented by the data file.
	 */
	private static BST readFile(Scanner in) {
		// TODO Auto-generated method stub
		// creates a new binary search tree.
		BST createBST = new BST(); 
		
		// This loop reads the lines and
		// stands out the filename of the profile.
		while(in.hasNextLine()) {
			
			// Reads the first line of the profile.
			String currentline = in.nextLine();
			
			// Recognise the name profile.
			Scanner r = new Scanner(currentline);
			
			// Inserts the new BST in the method profile.
			createBST.insertProfile(profile(r));
		}
		return createBST; 
	}
}

 
