// Let's talk about Peek
// Peek method is not change another stream 
// you can modify information without changing another type

// Here we go 

List<Product> list = Files.lines(Path.of("Simple.txt")).
					 map( streamString -> new Product(streamString)).
					 toList(); // Yes you have List<Product>  

list = list.stream().peek( productStream -> {
	   int newPrice = productStream.getPrice() + 200;
	   productStream.setPrice(newPrice);
	   }).toList();

// You have absolutely change price 
// That's it.




class Product {

	private String name;
	private int price;

	Product(String line) {
		String [] array = line.split("\t");
		this.name = array[0];
		this.price = Integer.parseInt(array[1]);
	}

	String getName() {
		return this.name;
	}

	int getPrice() {
		return this.price;
	}

	void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return String.format("Product : { name : %s ==> price : %d }", name , price);
	}
}