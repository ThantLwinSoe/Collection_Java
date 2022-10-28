class Product {
	private String name;
	private int price;

	public String getName() {
		return this.name;
	}

	public int getPrice() {
		return this.price;
	}

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String toString() {
		return String.format("Product {name : %s, price : %d}",name,price);
	}
}



// Now Here we go 
// You have Product Frame with name and price 
// We wanna that taking the simple text from txt file
// and change the Product object type
// That we want 
// So what we can do

// We have Files.lines(Path path) method, this method will return static Stream<String>
// Path.of(url of String ) method to change data from the file to return Path Object 

Stream<String> lines = Files.lines(Path.of("simple.txt"));
// Stream<String>

// So We have Stream String
// but Product Object have name and price
// we need to change String and int

Stream<String []> array = lines.map( thisIsLines -> thisIsLines.split("\t"));
// Stream<String []>

// So we have String array
// Now we try to change String and int Product type from Stream<String []>  

Stream<Product> product = array.map( thisIsArray -> new Product(a[0] , Integer.parseInt(a[1])));

// Now you can check by the list
List<Product> list = product.toList();