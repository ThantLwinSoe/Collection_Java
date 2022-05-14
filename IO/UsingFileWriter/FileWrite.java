import java.io.*;
import java.util.*;


public class FileWrite {

	public static void main(String [] args) {

		String message = ". Hello Darkness my old friend!!!";
		writer("useFileWriter.txt", message);

	}

	static void writer(String fileName, String data) {

		char [] c = data.toCharArray();

		int [] j = {};

		for (int i= 0; i < c.length ; i ++ ) {

			j = Arrays.copyOf(j, j.length +1);

			j[j.length - 1] = c[i];

		}


		// FileNotFoundException
		
		try(FileWriter filewriter = new FileWriter(fileName , true)){

			
			for (int i = 0; i < j.length ; i ++) {

				
				// IO Exception
				filewriter.write(j[i]);
						
			}


		} catch (FileNotFoundException e) {

			System.out.println("Please enter the correct the File");
		} catch (IOException e) {
			System.out.println("This is IO Exception!!!");
		}

		
		


	}
}