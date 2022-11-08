// Let's talk about Optional API 
// we have some situration like a return values have or not
// so if we does not need return values and we don't want to 
// return null 
// So we use Optional like that 
// See Line number 37 situration

// Here we go 

Product[] array = Files.lines(Path.of("simple.txt")).
				  map( stringStream -> new Prouct(stringStream)).
				  toArray( amountOfProducts -> new Product[amountOfProducts]);

// we have array
Optional<Product> result = findMaxProduct(array, 1000);

// here we have Optinal type
// If we insert 20000 
// Optional.ofNullable(parameter) will return 
// Optional.empty





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

Optional<Product> findMaxProduct(Product[] product , int lowerPrice){

	Product result = null;

	for(Product p : product){

		if(p.getPrice() >= lowerPrice){
			if( result == null || p.getPrice() > result.getPrice()){
				result = p;
			}
		}
	}
	return Optional.ofNullable(result);
}
