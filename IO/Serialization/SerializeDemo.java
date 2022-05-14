import java.io.*;
import java.util.*;

public class SerializeDemo {

	private static Scanner sc;
	private static String test;

	static{

		sc = new Scanner(System.in);
	}

	public static void main(String [] args) {


		System.out.println("Do you want to write Object from JVM to Physical Memory!!!");
		System.out.println("So Please Type 'Yes'");

		if( (test = sc.nextLine()).equals("Yes")) {

			try ( ObjectOutputStream obj = new ObjectOutputStream( new FileOutputStream("helloObject.txt")) ) {

				obj.writeObject(doHello("NyiMaLay"));
				obj.writeObject(doShop("Love" , "KoGyi"));

			} catch (FileNotFoundException e) {

				System.out.println(" This is File Not Found Exception. Please enter file name correctly ");
			
			} catch (IOException e) {

				System.out.println(" This is IO Exception!!");

			
			} catch (SecurityException e) {

				System.out.println("This is Security Exception!!!");

			}




		}

	}

	static Hello doHello(String name){

		return new Hello(name);
	}

	static Shop doShop(String name , String item) {

		return new Shop(name , item);
	}
	
}

class Hello implements Serializable{

	String name;

	Hello(String name) {

		this.name = name;
	}


}

class Shop implements Serializable{

	String item;
	String name;

	Shop(String name, String item) {
		this.name = name;
		this.item = item;
	}
}


// One Things we need to understand about of SerialVersionUID 
// When we made somthing changed the reference Class Object, The SerialVersionUID was changed
// So We need to set final SerialVersionUID number in Serialization field (Referebce Object) like that
// final long serialVersionUID = 100L;