import java.io.*;
import java.util.*;

public class writeFile {

	public static void main(String [] args) {

		if(args.length >= 2) {

			if(args[0].equals("I")) {

				write(" Ok naw buudy 3!!!", args[1]);

			} else if(args[0].equals("O")) {

				System.out.println("This is Read Option!!!");

				read(args[1]);

			} else {

				System.out.println("Please set first parameter as I or O");
			}

		}else {

			System.out.println("Plese enter the parameter correctly!!!");

		}
	}

	static void write(String message, String fileName) {

		byte [] ok = message.getBytes();

		/*
		try {
			
			// FileNotFoundException will be
			FileOutputStream data = new FileOutputStream(fileName, true);

			// IO Exception will be
			data.write(ok);

			// IO Exception will be
			data.close();
		
		} catch (FileNotFoundException e) {

			System.out.println("Please make sure the file name.");
		
		} catch (IOException e) {

			System.out.println(" This is an IO exception ");
		}

		*/

		// Above the writing form may be one problem
		
		/* First build FileOutputStream Object and When we are writing
		*	data in the file, it is possible IO exception then this program will not close.
		*/ 

		// So We have to write other form 

		/*
		
		FileOutputStream data = null;

		try {
			
			// FileNotFoundException will be
			data = new FileOutputStream(fileName, true);

			// IO Exception will be
			data.write(ok);

			
		
		} catch (FileNotFoundException e) {

			System.out.println("Please make sure the file name.");
		
		} catch (IOException e) {

			System.out.println(" This is an IO exception ");
		} finally {
			
			try {
				// IO Exception will be
				data.close();
			} catch (IOException e) {
				System.out.println("This is close Exception!!!");
			}
		

		}
		
		*/

		// The best way is try with resources 

		try (FileOutputStream data = new FileOutputStream(fileName, true)) {
			

			// IO Exception will be
			data.write(ok);

			
		
		} catch (FileNotFoundException e) {

			System.out.println("Please make sure the file name.");
		
		} catch (IOException e) {

			System.out.println(" This is an IO exception ");
		}



	}

	static void read(String fileName) {

		// The Best Way is Try with resources
		// This does not need close() method.

		char [] i = {};

		int result = 0;

		try(FileInputStream reader = new FileInputStream("helloWrite.txt")) {

			while( (result = reader.read()) >= 0 ) {

				i = Arrays.copyOf(i, i.length + 1);

				i [i.length - 1] = (char) result;
			
			// Just Test	
			//	System.out.println(i[i.length-1]);
			}

			System.out.println(new String(i));

		} catch (FileNotFoundException e) {

			System.out.println("Please enter the correct file name.");
		} catch (IOException e) {

			System.out.println("This is IO Exception!!!");
		}

	}

}