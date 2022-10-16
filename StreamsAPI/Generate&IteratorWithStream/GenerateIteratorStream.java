// Assume you want to generate some stream
// So you can use generate and Iterator


// Now here we go about generate
// first generate method have IntSupplier that return int type 
// So we need to create int type from Math.random()
IntStream str = IntStream.generate(() -> (int) (Math.random() * 100));

// Here is IntStream with int type data

// Note very important thing is 
// if you use generate method 
// you need to use limit(n) method 
// because of infinity loop
str.limit(20).forEach( a -> System.out.println(a));


// So you want to use iterator method
// Here we go
Stream cha = Stream.iterator('a', c -> (char) (c+1));

// Note very important thing is 
// you need to use limit() method
cha.limit(7).forEach(a -> System.out.println(a));