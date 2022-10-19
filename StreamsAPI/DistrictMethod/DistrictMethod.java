// Assume that you have one List
// If you want to eliminate dulplicate data from list 
// you can use district method from Stream API

// fist 
List<Integer> list = List.of(1,2,2,3,3,3,4,5);

// secnond is change Stream type to  distinct 
Stream<Integer> stream = list.stream();

// Here you have Stream Integer Type
// Now you can use distinct method that will return other Stream
Stream<Integer> str = stream.distinct();

// Now you can change list type using toList()
var printList = str.toList();