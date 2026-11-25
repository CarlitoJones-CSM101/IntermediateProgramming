package Methods;

public class JonesMethodDemo {
	
	//User Defined Method 
	static void greet() {
		System.out.println("Hello From Greet()!");
		
	}
	//	main () is also inside JonesMethodDemo
	public static void main(String[] args) {
		System.out.println("Program Starts");
		
		// Call the method directly by its name
		greet();
		
		System.out.println("Program Ends");
	}
	

}
