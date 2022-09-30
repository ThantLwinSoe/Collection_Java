public class HowToUseLambda {
	public static void main(String[] args) {
		Hello hello;
		// create lambda expression instance of anonymus class
		hello = (a,b) -> a+b;
		// call the add method
		System.out.println(hello.add(30,5));
		
	}
}

interface Hello {
	int add(int a, int b);
}