// Let's talk about we wanna Test IntSummaryStatistics class
// from Files
// but we will go like that Stream to list to IntStream to IntSummaryStatistics

// So first list
List<Product> list = Files.lines(Path.of("simple.txt")). // Stream<String>
					 map( stringFromLines -> new Product (stringFromLines)). // Stream<Product>
					 toList(); // List<Product>

IntStream intStream = list.stream().mapToInt( listObject -> listObject.getPrice()); // IntStream with price data

IntSummaryStatistics sumStat = intStream.summaryStatistics();

// Here you can check the method of IntSummaryStatistics class
// like this method

sumStat.getCount();
sumStat.getSum();
sumStat.getMax();
sumStat.getMin();




class Product {

	private String name;
	private int price;

	Product(String string) {
		String [] array = string.split("\t");

		this.name = array[0];
		this.price = Integer.parseInt(array[1]);
	}

	String getName(){
		return this.name;
	}

	int getPrice(){
		return this.price;
	}

	public String toString() {
		return String.format("Product { name : %s , price : %d}", name , price);
	}
}


