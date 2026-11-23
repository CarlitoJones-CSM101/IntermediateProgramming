package Week3Jones;
import java.io.FileWriter;
import java.io.IOException;
// Java File Handling 
//File Writer creates the file if it does not exist.
public class W3A1Jones {
	public static void main(String[] args) {
		//If Firstname.txt already exists, its old contents are overwritten.
		try (FileWriter writer = new FileWriter("Carlito.txt")) {
			writer.write("Welcome to Java File Handling!"); 
			System.out.println("Text successfully written.");
		} catch (IOException e ) {
			System.out.println("Error writing to file.");
			
		}
	}

}
