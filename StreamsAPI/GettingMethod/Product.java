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
