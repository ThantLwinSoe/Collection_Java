public class LocalVariables {

	public static void main(String[] args) {

		// When call local variables from Annonymus Class
		// local varicables must be final variable
		// but when SE 8 develped fianl  keyword can be omissio if u don't to write
		int value = 10;

/*		Runnable runnable = new Runnable() {
			public void run(){
				System.out.println("Value is: " + value);
			}
		};
*/		
		// To use Lambda 
		Runnable runnable = () -> 
			System.out.println("Value L is: " + value);
		runnable.run();

		// But value is final cous of 
		// use from the Annonymus class or Lambda 
		// this will complie time error
		// value = 20;
	}
}