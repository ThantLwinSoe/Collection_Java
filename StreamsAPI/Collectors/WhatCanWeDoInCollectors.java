// Let's talk about Collector
// Collector are returned by the Collectors mehtod

Collectors.toList(); //will return list Type  

Collectors.toSet(); // will return set Type

// so for example we have to using Collect method paramter by Collect
// So we can use Collectors.toSet()
// Collectors.toList();
// Something like that


// Let's say reduce and collect

list<Integer> list = List.of(5,4,3,2,1);

list.stream().reduce(0, (a,b) -> a + b); // this will return 15

list.stream().collect(Collectors.summingInt(a -> a)); // this will return 15

list.stream().collect(Collectors.summingDouble( a -> (double) a)); // this will return 15.0

// Same 
// But Collectors functions can be used more fully choice