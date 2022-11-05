// Let's talk about toArray() Method of Stream API
// toArray() no parameter method have return just Object array
// But we want customized Array and want to use Customized method 
// Here toArray method

Object[] object = Files.lines(Path.of("simple.txt")). // Stream<String>
				  map( stringStream -> new Product(stringStream)). // Stream<Product>
				  toArray(); // Here is Just Object[] array

// So We want to Product[] 
// Here we go 

Product[] product = Files.lines(Path.of("simple.txt")).
					map( stringStream -> new Product(stringStream)).
					toArray( amountOfProductStream -> new Product[amountOfProductStream]);
// This will return Product[] array

// Yes we can use Product method just like getPrice()

product[0].getPrice();
product[0].getName(); // And so on ...

