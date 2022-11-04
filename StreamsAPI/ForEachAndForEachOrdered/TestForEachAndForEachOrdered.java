// Let's talk about ForEach method of Stream API
// forEach Method is the just Looping 

IntStream test = IntStream.rangeClosed(1, 7); 

test.forEach( a -> System.out.println(a));

// This will print 1,2,3,4,5,6,7

// Next, we try ForEachOrdered method of Stream API
// This is nothing change for sequencial Stream as forEach Method

IntStream test2 = IntStream.rangeClosed(1,7);
test2.forEachOrdered( System.out :: println);

// But forEachOreder was used in Parallel Processing for oreder print

IntStream str = IntStream.rangeClosed(1,10).parallel();
str.forEach( System.out :: println);

// This will print without ordered within 1 to 10 becus of not Orded method

// Now forEachOrdered method will arrange order

IntStream
str2 = IntStream.rangeClosed(1,10).parallel();
str2.forEachOrdered(a -> System.out.println(a));

// This will print 1,2,3,4,5,6..10 with orderring
