package Methods;
//Execution Order
	//1. main() begins.
	//2. "Step 1" is displayed.
	//3. showMessage() is called and runs.
	//4. Control returns to main().
	//5."Step 3" is displayed.
public class JonesCallFlow {
	static void showMessage() {
	System.out.println("Inside showMessage()");
}
	public static void main(String[] args) {
		System.out.println("Step 1:");
		showMessage(); // method call
		
		System.out.println("Step 3");
	}
}