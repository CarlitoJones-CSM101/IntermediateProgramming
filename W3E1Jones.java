package Week3Jones;

// Required imports for console input and character-based file I/O
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class W3E1Jones {
	public static void main(String[] args) {
		Scanner jones = new Scanner(System.in);
		String jonesFileName = "E1Carlito .txt"; // Target text file for storing student records
		int jonesChoice; // Stores the user's menu selection

		// Repeat menu until the user chooses option 3 (Exit)
		do {
			System.out.println("\n=== Student Record Menu ===");
			System.out.println("1.) Input new Student record");
			System.out.println("2.) View Student records");
			System.out.println("3.) Exit");
			System.out.print("    Enter choice: ");

			jonesChoice = jones.nextInt();
			jones.nextLine(); // Consume leftover newline after reading integer input

			// Match user selection
			switch (jonesChoice) {
			case 1:
				// Collect student details from the user
				System.out.print("Enter Student Number: ");
				String jonesStudNumber = jones.nextLine();

				System.out.print("Enter Last Name: ");
				String jonesLastname = jones.nextLine();

				System.out.print("Enter First Name: ");
				String jonesFirstname = jones.nextLine();

				System.out.print("Enter Course: ");
				String jonesCourse = jones.nextLine();

				// Format all fields into a single pipe-delimited record line
				String jonesRecord = "StudNumber:" + jonesStudNumber
						+ " | Last Name: " + jonesLastname
						+ " | First Name: " + jonesFirstname
						+ " | Course: " + jonesCourse + "\n";

				// Append the new record to the file without overwriting existing entries
				try (FileWriter jonesWriter = new FileWriter(jonesFileName, true)) {
					jonesWriter.write(jonesRecord);
					System.out.println("Student Record Saved");
				} catch (IOException e) {
					System.out.println("Error writing to file.");
				}
				break;

			case 2:
				// Read and display all saved student records character by character
				System.out.println("\n--- Student Records ---");
				try (FileReader jonesReader = new FileReader(jonesFileName)) {
					int jonesCh;
					// reader.read() returns -1 when the end of the file is reached
					while ((jonesCh = jonesReader.read()) != -1) {
						System.out.print((char) jonesCh);
					}
				} catch (IOException e) {
					System.out.println("Error reading file.");
				}
				break;

			case 3:
				// Terminate the loop and exit the program
				System.out.println("Exiting Program");
				break;

			default:
				// Handle any number outside 1-3
				System.out.println("Invalid Choice.");
			}
		} while (jonesChoice != 3);

		jones.close(); // Close Scanner to release input stream resources
	}
}