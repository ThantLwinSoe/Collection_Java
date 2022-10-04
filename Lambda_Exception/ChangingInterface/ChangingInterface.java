public class ChangingInterface {

	public static void main(String[] args) {
		A.callStatic();
	}

}

interface Change {

	default void hello() {
		System.out.println("Hello Default from interface");
	}
}

class A implements Change {

	public static void callStatic() {
		var b = new B();
		b.sayHello();

//		default method from interface cannot write in static method		
//		hello();
	}
}

class B implements Change{

	void sayHello(){
		System.out.println("Hello Buddy");
//		Yes you can write default method from interface in instance method		
		hello();
	}
}