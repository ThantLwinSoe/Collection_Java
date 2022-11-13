// Let's talk about TakeWhile method of StreamApI
// TakeWhile method was developed in Java 16

// TakeWhile method have predicate that is check the condition
// with predicate 
// If Stream is ordered, while conditions is ture 
// the data will be taken
// But Conditions check false result this will not continous

// Just like that 

jshell> Stream.of(1,2,7,4,5).takeWhile( a -> a< 6).toList()
$2 ==> [1, 2]

jshell> Stream.of(1,2,4,5).takeWhile( a -> a< 6).toList()
$3 ==> [1, 2, 4, 5]

jshell> Stream.of(7,1,2,4,5).takeWhile( a -> a< 6).toList()
$4 ==> []

jshell> Stream.of(1,2,4,5,8).takeWhile( a -> a< 6).toList()
$5 ==> [1, 2, 4, 5]

// Note takeWhile is different filter method 
// Not same 
// Filter method is continously to the end when conditions is ture or false 