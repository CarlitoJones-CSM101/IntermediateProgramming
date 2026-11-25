package Methods;

public class JonesMethodExamples {
	//1.void, no parameter
	static void showTitle() {
		System.out.println("Methods");
		
	}
	//2. void, with parameter
	static void showName(String name) {
		System.out.println("Hello, " + name );
	}
	public static void main(String[]args) {
		showTitle();
		showName("Alex");
	}

}
