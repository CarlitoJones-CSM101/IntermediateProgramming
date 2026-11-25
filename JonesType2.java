		package Methods;
		import java.util.Scanner;
		public class JonesType2 {
			// receives student info as parameters
			static void displayStudent(String name, int yearLevel, String name1) {
				System.out.println("Student: "+ name + "\nYear Level:" + yearLevel + "\nGrade: " + name1);
			}
			public static void main(String[] args) {
				Scanner jones = new Scanner(System.in);
				
				System.out.println("What is Student Name:");
				String userinput = jones.nextLine();
				System.out.println("What is Student YearLevel:");
				int userinput1 = jones.nextInt();
				jones.nextLine();
				System.out.println("What is Student Section:");
				String userinput2 = jones.nextLine();
				
				displayStudent(userinput,userinput1,userinput2);
			
			}
		
		}
