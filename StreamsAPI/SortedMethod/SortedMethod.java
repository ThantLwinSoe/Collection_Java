// You have one Random List 
// if you can sorted decrese order or increse order
// you can user sorted method from stream 

List<Integer> list = List.of(9,1,8,2,4,3,5,6,7);

// so change stream type 
Stream<Integer> stream = list.stream();

// For increase order, you can use non arguments sorted method
Stream<Integer> st = stream.sorted();

// Now you have Sorted Stream 
// So you can print from list type that change from Stream type
List<Integer> list = str.toList();

// List will show you 
// 1,2,3,4,5,6,7,8,9


// here stream
// you can use sorted(Comparator <? super T> comparator)
// (a,b) -> b - a ; is the sorted the stream from reverse
// a is small b is larger
Stream<Integer> str = stream.sorted((a,b) -> b -a );

// Now you have Sorted Stream 
// So you can print from list type that change from Stream type
List<Integer> list = str.toList();

// list will show you 
// 9,8,7,6,5,4,3,2,1