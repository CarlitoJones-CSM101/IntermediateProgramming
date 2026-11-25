package Methods;

public class JonesTraceMethod {
	static int doubleIt(int value) {
		return value * 2;
	}
	static void printLine(int number) {
		System.out.println("Result = " + number);
	}
	public static void main(String[] args) {
		int x = 0;

		
		x = doubleIt(6);
		printLine(x);
		printLine(doubleIt(4));
	
	}

}
