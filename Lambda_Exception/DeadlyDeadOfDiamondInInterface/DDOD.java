public class DDOD {

	public static void main(String[] args) {
//		Anonymus class to use interface
		var d = new D() {};
		d.hello();
		
	}
}

interface A {
	default void hello(){
		System.out.println("From A!!!");
	}
}

interface B extends A{
	default void hello(){
		System.out.println("From B!!!");
	}
}

interface C extends A{
	default void hello(){
		System.out.println("From C!!!");
	}
}

interface D extends C, B{
	default void hello(){
// 		From B and call super object and hello() method
		B.super.hello();
	}
}