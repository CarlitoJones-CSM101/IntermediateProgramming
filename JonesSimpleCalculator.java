package Methods;

public class JonesSimpleCalculator {
	static int add (int a, int b) {
		return a + b;
	}
	static int subtract(int a, int b) {
		return a - b ;
	}
	static void showResult(String label, int result) {
		System.out.println(label + result);
		
	}	
	public static void main(String[] args) {
		int total = add(15,5);
		int difference = subtract (15,5);
		showResult("Sum: ", total);
		showResult("Difference: ", difference);
	}

	

}
