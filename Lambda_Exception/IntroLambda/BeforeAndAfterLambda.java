public class BeforeAndAfterLambda {

	public static void main(String[] args) {

		//before Lambda
		//Thread is a class
		Thread thread = new Thread(new Runnable(){
			// run method is a abstract method from Runnable interface
			@Override
			public void run(){
				System.out.println("Hello Thread");
			}
		});

		thread.start();

		// After Lambda 
		Thread okThread = new Thread(
			() -> {System.out.println("Hello Lambda");} );

		okThread.start();
		
	}
}