import java.io.*;
import java.util.*;

public class FileRead {


	public static void main(String [] args ) {

		System.out.println("***** This is data ******");

		// reader("Using FileWriter");

		// Reader method with Absolute Path 
		reader("/home/tls/JavaInLinux/Collection_java/IO/UsingFileWriter/useFileWriter.txt");

	}

	static void reader(String fileName) {

		int result = 0;

		byte [] ok = {};


		// FileNotFoundException
		try(FileReader filereader = new FileReader(fileName)){

			while ((result = filereader.read()) >= 0 ) {

				ok = Arrays.copyOf( ok , ok.length + 1);

				ok[ ok.length - 1 ] = (byte) result;

			}

		} catch (FileNotFoundException e) {

			System.out.println("Please enter the file name correctly!!!");

		} catch (IOException e) {

			System.out.println("This is IO Exception");
		} 

		
		System.out.println(showMe( ok ));

	}

	static String showMe(byte [] yes) {

		return new String(yes);

	}
}