// ********** Constructor Method Refrence ************

// SAM Interface
interface DataProducer {
	// return data type
	Data produce();
}

// No argument Constructor
class Data {
	public Data(){

	}
}

// This will work cous of return Data and no argument Counstructor are matched SAM interface
DataProducer p = Data :: new 
// this will return Data Object 
p.produce();








// Second Type SAM with argument
interface DataProducer {
	// return data type
	Data produce(int i);
}

// With Argument Constructor
class Data {
	int i;
	// with argument
	public Data(int i) {
		this.i = i;
	}
}
// invoke 
DataProducer p = Data :: new
// use p.produce(int i) that will return data type 
// this will store 20 in Data object
Data data = p.produce(20);
// for check 
data.i 