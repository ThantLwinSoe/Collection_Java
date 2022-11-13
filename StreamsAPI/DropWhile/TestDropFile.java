// Let's talk about DropWhile method
// DropWhile method is drop data 
// when the checked result is true continously drop data
// but ture once data take the following data from the stream
// Checking process is stopped.

// Let's see the example 

jshell> Stream.of(1,2,4,5,8).dropWhile( a -> a< 6).toList()
$1 ==> [8]

jshell> Stream.of(9,10,1,2,4,5,8).dropWhile( a -> a< 6).toList()
$2 ==> [9, 10, 1, 2, 4, 5, 8]

jshell> Stream.of(9,10,1,2,9,4,5,8).dropWhile( a -> a< 6).toList()
$3 ==> [9, 10, 1, 2, 9, 4, 5, 8]

jshell> Stream.of(1,2,9,4,5,8).dropWhile( a -> a< 6).toList()
$4 ==> [9, 4, 5, 8]

jshell> Stream.of(9,10,1,2,9,4,5,8).dropWhile( a -> a< 6).toList()
$5 ==> [9, 10, 1, 2, 9, 4, 5, 8]

jshell> Stream.of(1,2,9,4,5,8).dropWhile( a -> a< 6).toList()
$6 ==> [9, 4, 5, 8]

jshell> Stream.of(1,2,3,4,5,6).dropWhile( a -> a< 6).toList()
$7 ==> [6]

jshell> Stream.of(1,2,3,4,5).dropWhile( a -> a< 6).toList()
$8 ==> []

jshell> Stream.of(9,8,7,6).dropWhile( a -> a< 6).toList()
$9 ==> [9, 8, 7, 6]
