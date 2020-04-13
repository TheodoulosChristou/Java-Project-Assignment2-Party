/**
 * FileReaderMain is a class that is used to test
 * if the file reader works.
 */
public class FileReaderMain {
	public static void main(String[] args) {
		
		
		// creates binary search tree which
		// puts the file that will be read 
		// from the class FileReader and the method
		// readProfile.
		BST file = FileReader.readProfiles("Text.txt"); 
		
		
		// prints the file.
		System.out.println(file.root);
		file.root.getProfile().getInterests();
		System.out.println(file.root.getLeft());
		file.root.getLeft().getProfile().getInterests();
		System.out.println(file.root.getRight());
		file.root.getRight().getProfile().getInterests();
		System.out.println(file.root.getRight().getRight());
		file.root.getRight().getRight().getProfile().getInterests();
		System.out.print(file.root.getLeft().getLeft()); 
		file.root.getLeft().getLeft().getProfile().getInterests();
	}
}
 
