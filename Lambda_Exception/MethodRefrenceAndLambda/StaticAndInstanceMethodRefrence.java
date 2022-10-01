// ************** Method Refrence ***************
// Single Abstract Method in Interface 
interface Hello {
	void sayHello(String name);
}

// Use Lambda
// To create to use sayHello() by Hello Type
Hello hello = name -> System.out.println(name);

// To actual print
// This will print "Thant"
hello.sayHello("Thant");

// Use Instance
// To Creat instance method same signature of SAM
class OkInstance {
	public void mite(String name){
		System.out.println(name);
	}
}
// To create to use sayHello() by Hello Type
var oklay = new OkInstance();
Hello hello = oklay :: mite // Method Owner :: Method Name

// This will print "Soe"
hello.sayHello("Soe");


// Use Static
// To Creat static method same signature of SAM 
class OkStatic {
	public static void yes(String name){
		System.out.println(name);
	}
}

// To create to use sayHello() by Hello Type
Hello hello = OkStatic :: yes // Method Owner :: Method name
// This will print Lwin
hello.sayHello("Lwin");




