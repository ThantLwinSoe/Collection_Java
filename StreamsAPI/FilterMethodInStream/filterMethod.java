// Test the filter Method in Stream API
// Assume that you have one Int Array

int [] i = {1,2,3,4,5,6,7,8,9};

// can change the Stream type from Int Array
// Type must be IntStream or Stream<Integer>

IntStream stream = Arrays.stream(i);

// Here we have One Stream 
// So we use filter Method from Stream API
// fiter method return another Stream Type
IntStream stream2 = stream.filter(a -> a%2 != 0);

// Here stream2 have odd numbers 
// we use forEach method to print
// it will print odd numbers
stream2.forEach( a -> System.out.println(a));

// Note Very important 
// Stream is like a river data
// so we use consume all of the data from forEach Method
// if we use original stream just like 
stream.forEach(a -> System.out.println(a));

// This will Expression because of Stream data is gone using forEach
// This is the Stream 
